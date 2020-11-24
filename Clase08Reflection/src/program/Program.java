package program;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//Persona p = new Persona();
		Object p = null;
		
		//Importar los atributos
		//Class c = p.getClass();
		
		
		Class c = Class.forName("program.Persona");
		//levanta en memoria ram

		Constructor[] constructores = c.getConstructors();
		
		for(Constructor cons: constructores) {
			if(cons.getParameterCount()==0) {
				try {
					p = cons.newInstance(null);
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
		
		
		
		Field [] attrs = c.getFields();
		
		//Ejecutar los set
		for(Field f:attrs) {
			
			String nombreAt = f.getName();
			String nombreSetter = "set" + nombreAt;
			
			Method[] metodos = c.getDeclaredMethods();
			//tambien se puede encontrar el get method específico (+ performante)
			
			//Buscar los set
			for(Method m:metodos) {
				//Buscar el nombre
				if(m.getName().equalsIgnoreCase(nombreSetter)) {
					
					Object[] params = new Object[1];//Para guardar el parametro 
					
					//Setear los valores segun el tipo
					if(f.getType().equals(String.class)) {
						params[0] = "String";
					} else if(f.getType().equals(Integer.class)) {
						params[0] = 33320102;	
					} else {
						params[0] = null;
					}				
					//Invocar el método con el parámetro
					m.invoke(p, params);
				}
			}			
		}
		
		
		
		//Ejecutar los get
		for(Field f:attrs) {
			
			String nombreAt = f.getName();
			String nombreGetter = "get" + nombreAt;
			
			Method[] metodos = c.getDeclaredMethods();
			
			//Buscar los get
			for(Method m:metodos) {
				if(m.getName().equalsIgnoreCase(nombreGetter)) {
					//Invocar los get
					Object o = m.invoke(p, null);
					System.out.println("El parametro " + nombreAt + " valor " + o );
				}
					
			}
		}
		
		
		
		
		/*p.setDni(123456);

		Class c = p.getClass();

		//Importar los atributos
		//Field [] attrs = c.getFields();

		Field [] attrs = c.getDeclaredFields();

		for(Field f:attrs) {
			//Saber el nombre
			System.out.println(f.getName());
			System.out.println(f.getType());
			System.out.println(f.getModifiers());

		}

		Method[] metodos = c.getDeclaredMethods();

		for(Method m: metodos) {
			//llamar a un método
			if(m.getName().equals("getDni")) {
				//Debo pasarle la instancia donde
				//se va a ejecutar el método
				Object o = m.invoke(p,  null);
				System.out.println(o);
			} else if("setDni".equals(m.getName())) {
				//Preparo los parametros del objeto
				Object[] params = new Object[1];
				params[0] = 33320102;

				System.out.println(m.invoke(p, params));
			}
		}*/
		
		
	}
}
