package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Modelo;
import vista.interfaz;
import vista.login;

public class Controlador extends Modelo implements ActionListener,MouseListener  {
login l1 = new login();


    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** Se declaran en un ENUM las acciones que se realizan desde la
     * interfaz de usuario VISTA y posterior ejecución desde el controlador
     */
    public enum AccionMVC
    {

        Login
    }

    /** Constrcutor de clase
     */
    public Controlador()
    {
    }

    /** Inicia el skin y las diferentes variables que se utilizan */
    public void iniciar()
    {
        // Skin tipo WINDOWS
        try {
            l1.setVisible(true);
        } catch (Exception ex) {}

        //declara una acción y añade un escucha al evento producido por el componente
        this.l1.Login.setActionCommand("Login");
        this.l1.Login.addActionListener(this);
 

        //añade e inicia el jtable con un DefaultTableModel vacio
    }

    //Eventos que suceden por el mouse

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) { }
 
    //Control de eventos de los controles que tienen definido un "ActionCommand"

    public void actionPerformed(ActionEvent e) {
Modelo m = new Modelo();
    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case Login:
                    
{
    try {
        m.Logeo();
        System.out.println(resultado);
        if(resultado==0){
            interfaz i1 = new interfaz();
            l1.setVisible(false);
            i1.setVisible(true);
        }
    } catch (SQLException ex) {
         System.out.println("Haz introducido mal los datos");
    }
}
                
                break;                            
        }
    }

}
