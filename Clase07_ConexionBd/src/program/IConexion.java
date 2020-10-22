package program;

import java.sql.SQLException;
import java.util.List;

public interface IConexion {
	
	void abrirConexion() throws ClassNotFoundException, SQLException;
	void agregarPersona(Persona p) throws SQLException;
	void eliminarPersona(Persona p);
	void modificarPersona(Persona p);
	List<Persona> obtenerTodas();
	Persona obtenerPersona(Integer id);
	void cerrarConexion() throws SQLException;

}
