/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dep;

/**
 *
 * @author Joaquin
 */
public interface EmpleadoDAO {
    public boolean InsertarEmple(Empleado emp);
    public boolean EliminarEmple(int emp_no); 
    public boolean ModificarEmple(int emp_no, Empleado emp);
    public Empleado ConsultarEmple(int emp_no);    
}
