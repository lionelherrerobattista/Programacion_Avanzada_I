package ejercicio7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String uno = new String("UNO");
		String dos = new String("DOS");
		String tres = new String("TRES");
		Map lista = new TreeMap();
		lista.put(uno, uno);
		lista.put(dos,dos);
		lista.put(tres, tres);
		System.out.println(lista.size());
		
		/*
		Set<String> s = new HashSet<String>();
		
		s.add("Prueba");
		s.add("Prueba")
		s.add("Evaluación");
		s.add("Final");
		System.out.println();
		
		List<String> lista = new LinkedList();
		lista.sor*/
		
		
		/*String s = "No se, no entiendo, no funciona";
		String e = s.replaceAll("no", "");
		System.out.println(e);
		System.out.println(s.indexOf("no"));
		System.out.println(s.substring(s.indexOf("no")).toLowerCase());*/
		
		/*
		ClaseFinal cf = new ClaseFinal();
		
		try {
			cf.manejoExcepciones();	
		} catch (Exception e) {
			System.out.println(e.toString());
		}*/
		
		/*Number numero = 34;
		
		String numeroString = numero.toString();
		int numeroPrimitivo = numero.intValue();
		Double numeroDouble = Double.valueOf(numero.doubleValue());
		
	
		
		System.out.println(numeroString);
		System.out.println(numeroPrimitivo);
		System.out.println(numeroDouble);*/
	}

	/*public static String obtenerPalabra(Set <String> palabras, int index) {
		
		
		return ((HashSet) palabras).get(index);
	}*/
}



