import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoTexto {
	
	public static void read(File f) {
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine(); //lee una linea
			System.out.println(line);
			
			//Recorrer todo el archivo:
			while(line!=null) {
				line = br.readLine();
				System.out.println(line);
			}
			
			br.close();//siempre forzar que se cierre el archivo
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write(File f, String texto) {
		
		//try con recursos
		//Se puede definir cualquier objeto que implemente la interfaz closeable
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
			//FileWriter fw = new FileWriter(f, true); //es un archivo que vamos a escribir, propiedad true permite agregar al archivo
			//BufferedWriter bw = new BufferedWriter(fw); //Cómo vamos a escribir ese archivo
			bw.write(texto);
			//solo pasa al disco si se llena el buffer
			//se fuerza el volcado
			bw.flush(); //se vacía el buffer para que escriba
			
			//bw.close();//cierra el objeto para liberar el archivo
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
