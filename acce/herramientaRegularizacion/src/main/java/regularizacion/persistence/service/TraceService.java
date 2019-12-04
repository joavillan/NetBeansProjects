package regularizacion.persistence.service;

import java.util.List;
import java.util.Map;

public interface TraceService {
	Map<String, String>	 getTrazaCreacionByOrders(List<String> numerosOrden);
}
