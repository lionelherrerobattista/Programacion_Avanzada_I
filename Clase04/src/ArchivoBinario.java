import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoBinario {
	
	public static void CopiarArchivos(File rutaOrigen, File rutaDestino) {
		for(File archivoOrigen : rutaOrigen.listFiles()) {
			try {
				FileInputStream fis = new FileInputStream(archivoOrigen);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(rutaDestino + "\\" + archivoOrigen.getName());
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				byte[] buffer = new byte[1024]; //para ir guardando, objeto auxiliar
				
				int cant=0; // cantidad de caracteres que leyó
				while((cant = bis.read(buffer)) > -1) {
					bos.write(buffer, 0, cant); //guardo en el archivo y escribo hasta la cantidad de bytes que lee
				} //leo y guardo en el buffer
				//read devuelve -1 cuando no hay nada más para leer
				
				bos.flush();
				bis.close();
				bos.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
			}	
		}		
	}
	
	public static void CopiarArchivo(File origen, File destino) {
		
		try {
			FileInputStream fis = new FileInputStream(origen);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream(destino);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] buffer = new byte[1024]; //para ir guardando, objeto auxiliar
			
			int cant=0; // cantidad de caracteres que leyó
			while((cant = bis.read(buffer)) > -1) {
				bos.write(buffer, 0, cant); //guardo en el archivo y escribo hasta la cantidad de bytes que lee
			} //leo y guardo en el buffer
			//read devuelve -1 cuando no hay nada más para leer
			
			bos.flush();
			bis.close();
			bos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}	
	}
	

}
