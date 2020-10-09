import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<Persona> lista = new HashSet<Persona>();
//		List<Persona> lista = new ArrayList<Persona>();

		Persona p = new Persona("Matias", "Ramos");
		Persona p1 = new Persona("Matias", "Ramos");
		Persona p2 = new Persona("Juan", "Perez");

		lista.add(p);
		lista.add(p1);
		lista.add(p2);

		Persona buscar = new Persona("Matias", "Ramos");

		if (lista.contains(buscar)) {
			System.out.println("Esta");

		} else {
			System.out.println("No esta");
		}

		lista.remove(buscar);

		System.out.println(lista.size());

	}

}
