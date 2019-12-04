package modelo;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import vista.login;

public class Modelo extends database{
        CallableStatement pstm;
      login l1 =new login();
      public int resultado;
    public void Logeo() throws SQLException{
    pstm = this.getConexion().prepareCall("{?=call login("+'"'+l1.user.getText()+'"'+","+'"'+l1.password.getText()+'"'+")}");
    pstm.registerOutParameter(1,Types.NUMERIC);
    pstm.execute();
    resultado= pstm.getInt(1);
        System.out.println(resultado);
    }
}
