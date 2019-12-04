/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Joaquin
 */
public class SqlDbEmpleadoImpl implements EmpleadoDAO{

    Connection conexion;

    public SqlDbEmpleadoImpl() {
        conexion = SqlDbDAOFactory.crearConexion();
    }
    
    @Override
    public boolean InsertarEmple(Empleado emp) {
        boolean valor = false;
        String sql = "INSERT INTO empleados VALUES(?, ?, ?, ?, ?, ?, ?)";
        String departamento = "SELECT * FROM departamentos WHERE dept_no ="+emp.getEdept();
        String jefe = "SELECT * FROM empleados WHERE emp_no = "+emp.getDir();
        PreparedStatement sentencia;
        try {
            sentencia = conexion.prepareStatement(sql);
            if (ifExists(departamento) && ifExists(jefe)) {
                //System.out.println("Entra");
                sentencia.setInt(1, emp.emp_no);
                sentencia.setString(2, emp.eapellido);
                sentencia.setInt(3, emp.edept);
                sentencia.setInt(4, emp.dir);
                sentencia.setString(5, emp.fecha_alt);
                sentencia.setString(6, emp.oficio);
                sentencia.setDouble(7, emp.salario);


                int filas = sentencia.executeUpdate();
                //System.out.printf("Filas insertadas: %d%n", filas);
                if (filas > 0) {
                    valor = true;
                     System.out.printf("Empleado %d insertado%n", emp.getEmp_no());
                }
                sentencia.close();
            }else {
                System.out.println("No insertado");
            }

        } catch (SQLException e) {
            MensajeExcepcion(e);
        }
        return valor;
    }

    @Override
    public boolean EliminarEmple(int emp_no) {
        String jefe = "SELECT dir FROM empleados WHERE dir = "+emp_no;
        boolean valor = false;
        String sql = "DELETE FROM empleados WHERE emp_no = ? ";
        PreparedStatement sentencia;
        try {
            sentencia = conexion.prepareStatement(sql);
            if (!ifExists(jefe)) {
                sentencia.setInt(1, emp_no);
                int filas = sentencia.executeUpdate();
                if (filas > 0) {
                    valor = true;
                    System.out.printf("Empleado %d eliminado%n", emp_no);
                }
                sentencia.close();
            }else {
                System.out.println("No borrado");
            }
        } catch (SQLException e) {
            MensajeExcepcion(e);      
        }
        return valor;
    }

    @Override
    public boolean ModificarEmple(int emp_no, Empleado emp) {
        boolean valor = false;
        String sql = "UPDATE empleados SET eapellido = ?, edept= ?, dir= ?, fecha_alt= ?, oficio= ?, salario= ? WHERE emp_no = ? ";
        String departamento = "SELECT * FROM departamentos WHERE dept_no ="+emp.getEdept();
        String jefe = "SELECT * FROM empleados WHERE emp_no = "+emp.getDir();
        PreparedStatement sentencia;
        try {
            sentencia = conexion.prepareStatement(sql);
            if (ifExists(departamento) && ifExists(jefe)) {
                sentencia.setInt(7, emp_no);
                sentencia.setString(1, emp.eapellido);
                sentencia.setInt(2, emp.edept);
                sentencia.setInt(3, emp.dir);
                sentencia.setString(4, emp.fecha_alt);
                sentencia.setString(5, emp.oficio);
                sentencia.setDouble(6, emp.salario);
                int filas = sentencia.executeUpdate();
                //System.out.printf("Filas modificadas: %d%n", filas);
                if (filas > 0) {
                    valor = true;
                    System.out.printf("Empleado %d modificado%n", emp_no);
                }
                sentencia.close();
            }else {
                System.out.println("No modificado");
            }
        } catch (SQLException e) {
           MensajeExcepcion(e);      
        }
        return valor;
    }

    @Override
    public Empleado ConsultarEmple(int emp_no) {
        String sql = "SELECT emp_no, eapellido, edept, dir, fecha_alt, oficio, salario FROM empleados WHERE emp_no =  ?";
        PreparedStatement sentencia;
        Empleado emp = new Empleado();        
        try {
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, emp_no);
            ResultSet rs = sentencia.executeQuery();          
            if (rs.next()) {
                emp.setEmp_no(rs.getInt("emp_no"));
                emp.setEapellido(rs.getString("eapellido"));
                emp.setEdept(rs.getInt("edept"));
                emp.setDir(rs.getInt("dir"));
                emp.setFecha_alt(rs.getString("fecha_alt"));
                emp.setOficio(rs.getString("oficio"));
                emp.setSalario(rs.getDouble("salario"));
            }
            else
                System.out.printf("Empleado: %d No existe%n",emp_no);
            
            rs.close();// liberar recursos
            sentencia.close();
         
        } catch (SQLException e) {
            MensajeExcepcion(e);            
        }
        return emp;
    }
    
    private void MensajeExcepcion(SQLException e) {
       System.out.printf("HA OCURRIDO UNA EXCEPCIÓN:%n");
       System.out.printf("Mensaje   : %s %n", e.getMessage());
       System.out.printf("SQL estado: %s %n", e.getSQLState());
       System.out.printf("Cód error : %s %n", e.getErrorCode());
    }
    
    public boolean ifExists(String sSQL) throws SQLException {
    PreparedStatement ps = conexion.prepareStatement(sSQL);
    ResultSet rs = ps.executeQuery();
    return rs.next();
    }
}
