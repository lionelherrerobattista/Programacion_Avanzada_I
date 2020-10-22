package ejercicio7.test;

import org.junit.Assert;

import ejercicio7.ManejoPalabra;



public class ManejoPalabraTest {
	
	public void segundaPalabraOK() {
		
		ManejoPalabra mp = new ManejoPalabra();
		
		String segundaPalabra= mp.segundaPalabra("hola mundo");
		
		Assert.assertEquals("mundo", segundaPalabra);
		
	}

}
