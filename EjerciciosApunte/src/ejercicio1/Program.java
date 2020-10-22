package ejercicio1;

public class Program {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("AU123321", EMarca.ford, "KA", 1230450);
		Auto a2 = new Auto("BA456321", EMarca.renault, "Clio", 830450);
		Auto a3 = new Auto("EE123345", EMarca.volkswagen, "Cross", 2230450);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		

	}

}
