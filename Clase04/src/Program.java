import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File origen = new File("C:\\Users\\lion_\\Desktop\\prueba");
		File copia = new File("C:\\Users\\lion_\\Desktop\\nueva");

		ArchivoBinario.CopiarArchivos(origen, copia);
		
//		System.out.println("Ingrese el texto: ");
//		Scanner sc = new Scanner(System.in); //leo desde el input de la consola de java
//		String textoIngresado = sc.nextLine(); // Me permite escribir
//		
//		//Crear un archivo
//		File file = new File("prueba.txt");
//		ArchivoTexto.write(file, textoIngresado);
		
	}
	


}
