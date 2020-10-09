
public class Factory {
	
	public static AbstractConexion obtenerMotor(String motor) {
		
		//Compruebo el string
		if("MySql".equals(motor)) {
			return new MySql();
		} else if("Oracle".equals(motor)) {
			return new Oracle();
		} else {
			return null;
		}
		
	}

}
