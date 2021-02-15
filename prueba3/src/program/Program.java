package program;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program.ejecutarPrueba();
		
	}

	public static void ejecutarPrueba() {
		ManejoStringTest m = new ManejoStringTest();
		Method[] metodos = ManejoStringTest.class.getDeclaredMethods();
		
		for(Method metodo: metodos) {
			Test t = metodo.getAnnotation(Test.class);
			
			System.out.println("Nombre prueba: " + t.nombre());
			try {
				for(int i = 0; i < t.intentos(); i++) {
					metodo.invoke(m, null);	
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
	}
	
}
