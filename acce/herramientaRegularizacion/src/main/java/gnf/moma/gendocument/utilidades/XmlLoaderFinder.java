package gnf.moma.gendocument.utilidades;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Class that loads himself with a xml and finds some tags
 * 
 * @author llorenzo
 *
 */
public class XmlLoaderFinder {
	private static final Logger LOGGER = Logger.getLogger(XmlLoaderFinder.class);

	private Document document;
	private Element rootElement;

	public XmlLoaderFinder(String xml) {
		document = null;
		rootElement = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();

			document = builder.parse(new InputSource(new StringReader(xml)));
			rootElement = document.getDocumentElement();
		} catch (SAXException e) {
			LOGGER.error(e.getMessage());
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		} catch (ParserConfigurationException e) {
			LOGGER.error(e.getMessage());
		}

	}
	
	public XmlLoaderFinder(File xmlFile) {
		document = null;
		rootElement = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();

			document = builder.parse(xmlFile);
			rootElement = document.getDocumentElement();
		} catch (SAXException e) {
			LOGGER.error(e.getMessage());
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		} catch (ParserConfigurationException e) {
			LOGGER.error(e.getMessage());
		}
	}

	public String obtainWholeDocumentAsString() {
		DOMSource domSource = new DOMSource(document);
		return stringFromsource(domSource);
	}

	public static String obtainNodeAsString(Node nodo) {
		DOMSource domSource = new DOMSource(nodo);
		return stringFromsource(domSource);
	}

	private static String stringFromsource(DOMSource domSource) {
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tf.newTransformer();
			transformer.setOutputProperty("omit-xml-declaration", "yes");// evita
																			// poner
																			// delante
																			// <?xml
																			// version...
			transformer.transform(domSource, result);
		} catch (TransformerConfigurationException e) {
			LOGGER.error("Error obteniendo el documento xml como String" + e.getMessage());
		} catch (TransformerException e) {
			LOGGER.error("Error obteniendo el documento xml como String" + e.getMessage());
		}
		String resultado = writer.toString();
		return resultado;
	}

	/**
	 * Busca si existe un nodo en el XML
	 * 
	 * @param tagName
	 *            nombre del nodo a buscar
	 * @return devuelve el valor del elemento, cadena vacia si el nodo no existe
	 */
	public String getString(String tagName) {
		String retorno = "";
		if (rootElement != null) {
			NodeList list = rootElement.getElementsByTagName(tagName);
			if (list != null && list.getLength() > 0) {
				NodeList subList = list.item(0).getChildNodes();

				if (subList != null && subList.getLength() > 0) {
					retorno = subList.item(0).getNodeValue();
					LOGGER.debug("The tag name " + tagName + " was found with value " + retorno);
				} else {
					LOGGER.warn("The tag name " + tagName + " was not found");
				}
			}
		} else {
			LOGGER.error("please first load the root element using constructor with params");
		}
		return retorno;
	}

	/**
	 * Busca si existe un nodo en el XML cuyo padre es pasado por param
	 * 
	 * @param tagName
	 * @param parentName
	 * @return
	 */
	public String getStringWithParentName(String tagName, String parentName) {
		String retorno = "";
		if (rootElement != null) {
			NodeList list = rootElement.getElementsByTagName(tagName);
			if (list != null && list.getLength() > 0) {
				NodeList subList = list.item(0).getChildNodes();
				if (list.item(0).getParentNode() != null) {
					LOGGER.debug("The parent tag name is " + list.item(0).getParentNode().getNodeName());
					if (parentName.equals(list.item(0).getParentNode().getNodeName())) {
						if (subList != null && subList.getLength() > 0) {
							retorno = subList.item(0).getNodeValue();
							LOGGER.debug("The tag name " + tagName + " was found with value " + retorno);
						} else {
							LOGGER.warn("The tag name " + tagName + " was not found");
						}
					}
				} else {
					LOGGER.warn("The tag name " + tagName + " has not parent");
				}
			}
		} else {
			LOGGER.error("please first load the root element using constructor with params");
		}
		return retorno;
	}

	/**
	 * Busca si el último error de la traza.
	 * 
	 * @param tagName
	 * @param parentName
	 * @return
	 */
	public String getLastErrorDescription(String tagName, String lastStage) {
		String retorno = "";
		if (rootElement != null) {
			NodeList list = rootElement.getElementsByTagName(tagName);
			if (list != null && list.getLength() > 0) {
				int ultimaPos = list.getLength()-1;
				NodeList subList = list.item(ultimaPos).getChildNodes();
				if (list.item(ultimaPos).getParentNode() != null) {
					LOGGER.debug("The parent tag name is " + list.item(ultimaPos).getParentNode().getNodeName());
					// Si el campo viene dentro de la etiqueta error y es la
					// última etapa la recogemos.
					if (list.item(ultimaPos).getParentNode().getNodeName().equals("error")
							&& list.item(ultimaPos).getParentNode().getParentNode().getNodeName().equals(lastStage)) {
						if (subList != null && subList.getLength() > 0) {
							retorno = subList.item(0).getNodeValue();
							LOGGER.debug("The tag name " + tagName + " was found with value " + retorno);
						} else {
							LOGGER.warn("The tag name " + tagName + " was not found");
						}
					}
				} else {
					LOGGER.warn("The tag name " + tagName + " has not parent");
				}
			}
		} else {
			LOGGER.error("please first load the root element using constructor with params");
		}
		return retorno;
	}

	/**
	 * Metodo que aniade un elemento nuevo despues de un nodo indicado.
	 * 
	 * @param tagName
	 * @param value
	 * @param despuesDeNodo
	 * @return True si ha insertado bien, false en caso contrario
	 */
	public boolean addTag(String tagName, String value, String despuesDeNodo) {

		NodeList list = rootElement.getElementsByTagName(despuesDeNodo);
		// Verificar si existe el nodo del elemento anterior, si no existe (o
		// hay mas de uno) no aniadir nada
		if (list.getLength() == 1) {

			// Recuperamos el siguiente elemento
			Node siguienteElemento = list.item(0).getNextSibling();

			// Creamos el elemento con el nuevo tag a insertar (con su
			// correspondiente contenido)
			Node elementAtributos = document.createElement(tagName);
			elementAtributos.setTextContent(value);

			// Agregamos al anterior del elemento obtenido
			siguienteElemento.getParentNode().insertBefore(elementAtributos, siguienteElemento);

			// Se ha aniadido correctamente
			LOGGER.info("El tag se ha aniadido correctamente");
			return true;
		}
		LOGGER.error("El tag no se ha aniadido");
		return false;
	}

	/**
	 * obtiene el atributo de la raiz
	 * 
	 * @param attribute
	 *            el nombre del atributo a buscar
	 * @return el atributo de la raiz
	 */
	private String getRootAttribute(String attribute) {
		String retorno = "";

		if (rootElement != null) {
			retorno = rootElement.getAttribute(attribute);
			if (StringUtils.isEmpty(retorno)) {
				LOGGER.warn("The atribute " + attribute + " was not found ");
			} else {
				LOGGER.debug("The atribute " + attribute + " was found with value " + retorno);
			}

		} else {
			LOGGER.error("please first load the root element using constructor with params");
		}
		return retorno;

	}

	/**
	 * setea el atributo de la raiz
	 * 
	 * @deprecated usar setAttributeByTag con el nombre del tag porque nuestros
	 *             xml no son siempre iguales
	 * @param attribute
	 *            el nombre del atributo a buscar
	 * @param value
	 *            el valor a setear
	 */
	@Deprecated
	public void setRootAttribute(String attribute, String value) {
		if (rootElement != null) {
			rootElement.setAttribute(attribute, value);
		} else {
			LOGGER.error("please first load the root element using constructor with params");
		}
	}

	/**
	 * @param tag
	 * @param attribute
	 * @return attribute contains into a tag
	 */
	public String getAttributeByTag(String tag, String attribute) {

		String retorno = "";
		if (rootElement != null) {
			if (rootElement.getNodeName().equals(tag)) {
				retorno = getRootAttribute(attribute);
			} else {
				NodeList listXML = rootElement.getElementsByTagName(tag);
				if (listXML.getLength() > 0) {
					Node nNode = listXML.item(0);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						retorno = eElement.getAttribute(attribute);
					} else {
						LOGGER.warn("El tag " + tag + " no es elemento XML valido");
					}

				} else {
					LOGGER.warn("No se encuentra el tag: " + tag);
				}
			}
		}
		return retorno;

	}

	/**
	 * @param tag
	 * @param attribute
	 * @return attribute contains into a tag
	 */
	public void setAttributeByTag(String tag, String attribute, String value) {

		if (rootElement != null) {
			if (rootElement.getNodeName().equals(tag)) {
				setRootAttribute(attribute, value);
			} else {
				NodeList listXML = rootElement.getElementsByTagName(tag);
				if (listXML.getLength() > 0) {
					Node nNode = listXML.item(0);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						eElement.setAttribute(attribute, value);
					} else {
						LOGGER.warn("El tag " + tag + " no es elemento XML valido");
					}

				} else {
					LOGGER.warn("No se encuentra el tag: " + tag);
				}
			}
		}

	}

	Element getRootElement() {
		return rootElement;
	}

	public Node getNodeByTagName(String tag) {
		NodeList listXML = rootElement.getElementsByTagName(tag);
		if (listXML.getLength() == 1) {
			return listXML.item(0);

		} else if (listXML.getLength() == 1) {
			LOGGER.warn("hay mas de un tag con el nombre " + tag + ", devolviendo el primero.");
			return listXML.item(0);
		} else {
			LOGGER.warn("No se encuentra el tag: " + tag);
			return null;
		}

	}

	/**
	 * obtiene una cadena dentro de un cierto node que corresponda a un cierto
	 * tag, o bien el contenido del CData
	 * 
	 * @param findInto
	 * @param tag
	 * @return
	 */
	public static String findIntoByName(Node findInto, String tag) {
		NodeList childs = findInto.getChildNodes();
		Node toCompare;
		int i = 0;
		toCompare = childs.item(i);
		while (toCompare != null) {
			if (toCompare.getNodeName().equals(tag)) {
				return obtainNodeAsString(toCompare);
			} else if (toCompare.getNodeType() == Node.CDATA_SECTION_NODE) {
				// si hay algun cdata obtengo su contenido
				CDATASection cdata = (CDATASection) toCompare;
				return cdata.getData();
			}
			i++;
			toCompare = childs.item(i);
		}
		LOGGER.warn("findIntoByName(): no " + tag + " item found in node " + findInto.getNodeName() + ".");
		return null;

	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public void setRootElement(Element rootElement) {
		this.rootElement = rootElement;
	}
}
