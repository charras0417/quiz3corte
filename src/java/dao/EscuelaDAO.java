/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import vo.Escuela;

/**
 *
 * @author LabingI5
 */
public class EscuelaDAO implements IBaseDatos<Escuela>{

    
    public Escuela find(int codigo) throws SQLException{
       Escuela resultado = null;
       String query="Select * from Persona Where codigo ="+ codigo;
       Connection connection = Conexion.getConnection();
        try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0;
	    String nombre = null;
	    if (rs.next()){
                resultado = new Escuela();
	        id = rs.getInt("codigo");
	        resultado.setCodigo(id);
	        nombre = rs.getString("nombre");
	        resultado.setNombre(nombre); 
	        
                
	    }
	    st.close();
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener Escuela");
			e.printStackTrace();
		}
	    return resultado;
    }
    
    
    @Override
    public List findAll() throws SQLException {
        	List<Escuela> escuelas= null;
	    String query = "SELECT * FROM Escuela";
	    Connection connection = Conexion.getConnection();
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0;
	    String nombre = null;
	    while (rs.next()){
	    	if(escuelas == null){
	    		escuelas= new ArrayList<Escuela>();
	    	}
	      
	        Escuela registro= new Escuela();
	        id = rs.getInt("codigo");
	        registro.setCodigo(id);
	        nombre = rs.getString("nombre");
	        registro.setNombre(nombre); 
                escuelas.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de escuelas");
			e.printStackTrace();
		}
	    
	    return escuelas;
    }

    @Override
    public boolean insert(Escuela escuela) throws SQLException {
      	boolean result=false;
	Connection connection = Conexion.getConnection();
        String query = " insert into Escuela"  + " values (?,?)";
        PreparedStatement preparedStmt=null;
        try {
            preparedStmt = connection.prepareStatement(query);
	    preparedStmt.setInt(1, escuela.getCodigo());
            preparedStmt.setString(2, escuela.getNombre());
	    result= preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
	}
	return result;
    }

    @Override
    public boolean update(Escuela escuela) throws SQLException {
        boolean result=false; 
	Connection connection = Conexion.getConnection();
	String query = 
           "update Escuela set nombre = ?, where cedula = ?";
	PreparedStatement preparedStmt=null;
	try {
	    preparedStmt = connection.prepareStatement(query);
	    preparedStmt.setString(1, escuela.getNombre());
            preparedStmt.setInt(3, escuela.getCodigo()); 
                    
	    if (preparedStmt.executeUpdate() > 0){
	   	result=true;
	    }
			    
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
    }

    @Override
    public boolean delete(Escuela persona) throws SQLException {
        boolean result=false;
	Connection connection = Conexion.getConnection();
	String query = "delete from Escuela where codigo = ?";
        System.out.println(query + " " + persona.getCodigo());
	PreparedStatement preparedStmt=null;
	 try {
	    preparedStmt = connection.prepareStatement(query);
	    preparedStmt.setInt(1, persona.getCodigo());
	    result= preparedStmt.execute();
	} catch (SQLException e) {
	  e.printStackTrace();
	}
	return result;
    }
    
}
