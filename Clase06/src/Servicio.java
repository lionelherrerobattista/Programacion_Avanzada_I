
public class Servicio {
	
	private static Servicio s; //Para guardar la instancia
	
	Persona p;
	
	private Servicio () {
		this.p = new Persona();
	}
	
	
	//Genero adentro de un método la única instancia de la clase
	public static Servicio getInstance() {
		
		//If para que sea solo 1 instancia
		if(s == null) {
			s = new Servicio();	
		}
		
		
		return s;
	}
	
	public void cargarDatos(String nombre) {
		this.p.setNombre(nombre);
	}

}

