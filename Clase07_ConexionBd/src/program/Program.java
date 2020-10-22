package program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Conexión a base de datos
		try {
			//se levantan los objetos dentro de la memoria RAM
			Class.forName("com.mysql.jdbc.Driver");
			
			String pathConexion = "jdbc:mysql://localhost:3306/test";
			Connection connection = DriverManager.getConnection(pathConexion, "root", "");
			
			//Ejecutar cualquier consulta
			PreparedStatement st = connection.prepareStatement(
					"insert into persona (id, nombre, apellido)"
					+ " values (1, 'Lionel', 'Herrero')");
			st.execute();
			
			//Ejecutar consultas que requieren respuesta .executeQuery
			PreparedStatement stConsulta = connection.prepareStatement(
					"Select * from persona");
			ResultSet rs = stConsulta.executeQuery(); //enlace a la respuesta
			
			//Cargar lista de personas
			//List<Persona> personas = new ArrayList<>()
			
;			//Recorrer mientras haya respuesta
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				Integer id = rs.getInt(1);
				
				//Agregar persona a la lista
			}
			
			//ejecutar consultas
			connection.close(); //Se cierra la instancia.
			
			//retornar lista de personas
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
