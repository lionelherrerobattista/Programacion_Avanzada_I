package program.test;

import org.junit.Assert;
import org.junit.Test;

import program.ManejoPalabra;



public class ManejoPalabraTest {
	
	@Test
	public void segundaPalabraOK() {
		
		ManejoPalabra mp = new ManejoPalabra();
		
		try {
			
			String segundaPalabra= mp.segundaPalabra("hola mundo");
			
			Assert.assertEquals("mundo", segundaPalabra);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			Assert.fail();
		}
				
	}
	
	@Test
	public void sinSegundaPalabra() {
		
		ManejoPalabra mp = new ManejoPalabra();
		
		try {
			String segundaPalabra= mp.segundaPalabra("hola");	
			Assert.fail();
		} catch(ArrayIndexOutOfBoundsException e) {
			
			Assert.assertTrue(true);			
		}

	}

}
