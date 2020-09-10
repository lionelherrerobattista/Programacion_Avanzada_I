package program;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcular c = new Calcular();
		
		try {
			c.dividir(1, 0);
		}catch(MiUnchecked e) {
			System.out.println(e.getMessage());
		}
	}

}
