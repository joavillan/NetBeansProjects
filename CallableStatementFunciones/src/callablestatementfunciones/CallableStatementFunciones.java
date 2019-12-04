
package callablestatementfunciones;

import datos.Conexion;
import java.sql.*;

public class CallableStatementFunciones {

    public static void main(String[] args) {
        int empleadoId = 100; // indentificadora recuperar salario
        try {
            Connection con = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salarioMensual;
            cstmt = con.prepareCall("{ ? = callget_employee_salary(?) }");
// Una funcionregresa un valor
// por lo que lo registramos como el parametro1
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
// registrmosel segundo parametro
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual = cstmt.getDouble(1);
            cstmt.close();
            System.out.println("Empleado con id:" + empleadoId);
            System.out.println("Salario $" + salarioMensual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
