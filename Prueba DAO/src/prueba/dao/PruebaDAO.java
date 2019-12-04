/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.dao;

import Dep.*;

/**
 *
 * @author Joaquin
 */
public class PruebaDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAOFactory factory=new SqlDbDAOFactory();
        DepartamentoDAO dpto=factory.getDepartamentoDAO();
        EmpleadoDAO emp=factory.getEmpleadoDAO();
        Departamento dptoAux=new Departamento(1,"Mantenimiento","Sevilla");
        Empleado emple1=new Empleado(2, "Perez", 1, 1, "12/03/2019", "currito", 900.0);
        
        
        emp.InsertarEmple(emple1);
        emp.ConsultarEmple(emple1.getEmp_no());
        Empleado emple2=new Empleado(2, "Perez", 1, 1, "12/03/2019", "jefazo", 1500.0);
        emp.ModificarEmple(emple1.getEmp_no(), emple2);
        emp.ConsultarEmple(emple1.getEmp_no());
        emp.EliminarEmple(emple1.getEmp_no());
        emp.ConsultarEmple(emple1.getEmp_no());
        
        
        DAOFactory factory1=new NeodatisDAOFactory();
        DepartamentoDAO dpto1=factory1.getDepartamentoDAO();
        EmpleadoDAO emp1=factory1.getEmpleadoDAO();
        
        dpto1.InsertarDep(dptoAux);
        emp1.InsertarEmple(emple1);
        emp1.ModificarEmple(2, emple2);
        emp1.ConsultarEmple(2);
        emp1.EliminarEmple(2);
        dpto1.EliminarDep(1);
    }
    
}
