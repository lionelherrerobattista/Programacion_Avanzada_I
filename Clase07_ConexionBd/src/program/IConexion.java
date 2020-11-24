package program;

import java.sql.SQLException;
import java.util.List;

public interface IConexion {
	
	void abrirConexion() throws ClassNotFoundException, SQLException;
	void cerrarConexion() throws SQLException;

}
