package program;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//Teniendo una clase Auto con atributos marca y patente
				Object auto = null;
				
				Class c = Class.forName(Auto.class.getName());
					
				Constructor[] constructores = c.getConstructors();
				
				for(Constructor cons: constructores) {
					if(cons.getParameterCount()==2) {
						try {
							auto = cons.newInstance("ford", "ASC123");
						} catch (InstantiationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
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
						break;
					}
					
				}
				
				Field [] attrs = c.getDeclaredFields();

				//Ejecutar los get
				for(Field f:attrs) {
				
					
					String nombreAt = f.getName();
					String nombreGetter = "get" + nombreAt;			
					Method[] metodos = c.getDeclaredMethods();
					
					//Buscar los get
					for(Method m:metodos) {			
						if(m.getName().equalsIgnoreCase(nombreGetter)) {
							//Invocar los get
							Object o = m.invoke(auto, null);
							System.out.println("El atributo " + nombreAt + " tiene el valor: " + o );
						}
							
					}
				}
	}

}
