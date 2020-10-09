
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractConexion con = Factory.obtenerMotor("MySql");
		
		System.out.println(con.nombreBd());
	}

}
