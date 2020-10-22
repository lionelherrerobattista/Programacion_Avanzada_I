package clase;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellido;
	private Integer dni;

	
	//Constructor por defecto
	public Persona() {

	}
	
	public Persona(String apellido, String nombre) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}
	
	/*@Override
	public boolean equals(Object o) {
		if(o==null) {
			return false;
		}
		
		//Compruebo que el objeto sea de la clase
		if(o.getClass().equals(this.getClass())) {
			
			Persona p = (Persona) o; //Casteo el objeto que viene por parámetro
			//Comparo nombre y apellido
			if(p.nombre.equals(this.nombre) && p.apellido.equals(this.apellido)) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;	
		}
		
	}
	
	@Override
	public int hashCode() {
		int primo = 31; //número primero para que sea bien disperso
		int resultado = 0;
		//Multiplicar y sumar al resultado por todas las variables
		//Que se usan para sumar
		resultado += primo*this.nombre.hashCode();
		resultado += primo*this.apellido.hashCode();
		return resultado;
	}*/
	
	public void setNombre(String nombre) {
		 this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
		 

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	 

}
