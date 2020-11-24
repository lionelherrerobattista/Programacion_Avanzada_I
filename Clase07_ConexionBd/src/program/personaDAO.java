package program;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class personaDAO {
	
	
	@Override
	/**
	 * Agrega una persona a la BD
	 * @param p persona a agregar
	 * @exception SQLException
	 */
	public void agregarPersona(Persona p) throws SQLException {
		
		PreparedStatement st = connection.prepareStatement(
				"insert into persona (id, nombre, apellido)"
				+ " values (?, ?, ?)");
		
		//Configurar parámetros con ?
		st.setInt(1, p.getId().intValue());
		st.setString(2, p.getNombre().toString());
		st.setString(3, p.getApellido().toString());
		
		//Ejecutar consulta
		st.execute();
	}

	@Override
	public void eliminarPersona(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarPersona(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> obtenerTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona obtenerPersona(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
