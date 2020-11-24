package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Conexion implements IConexion {

	Connection connection;
	
	@Override
	/**
	 * Abre una instancia de la base de datos mySQL
	 */
	public void abrirConexion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String pathConexion = "jdbc:mysql://localhost:3306/test";
		this.connection = DriverManager.getConnection(pathConexion, "root", "");	
	}

	
	@Override
	/**
	 * Cierra una conexión abierta en connection
	 */
	public void cerrarConexion() throws SQLException {
		this.connection.close();
	}

}
