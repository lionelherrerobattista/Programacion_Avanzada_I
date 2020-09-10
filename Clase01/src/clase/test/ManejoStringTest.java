package clase.test;

import org.junit.Assert;
import org.junit.Test;

import clase.ManejoString;

public class ManejoStringTest {

	@Test
	public void cantidadCaracteresOk() {
		try {
			int cantidadCaracteres = ManejoString.cantidadCaracteres("hola");
			Assert.assertEquals(4, cantidadCaracteres);
		} catch (NullPointerException e){
			Assert.fail();
		}
	}
	
	@Test
	public void cantidadCaracteresPalabraNull() {
		try {
			int cantidadCaracteres = ManejoString.cantidadCaracteres(null);
			Assert.fail("No lanzo NullPointerException");
		} catch (NullPointerException e){
			Assert.assertTrue(true);
		}	
	}
	
	@Test
	public void primeraMitadOk() {
		try {
			String primeraMitad = ManejoString.primeraMitad("hola");
			Assert.assertEquals("ho", primeraMitad);
			
		} catch (NullPointerException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void primeraMitadLenghtUno() {
		try {
			String primeraMitad = ManejoString.primeraMitad("h");
			Assert.assertEquals("h", primeraMitad);
			
		} catch (NullPointerException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void primeraMitadPalabraNull() {
		try {
			String primeraMitad = ManejoString.primeraMitad(null);
			Assert.fail();
			
		} catch (NullPointerException e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void ultimoCaracterOk() {
		try {
			char ultimoCaracter = ManejoString.ultimoCaracter("hola");
			
			Assert.assertTrue(ultimoCaracter == 'a');
			
			
		} catch (NullPointerException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void ultimoCaracterStringUnCaracter() {
		try {
			char ultimoCaracter = ManejoString.ultimoCaracter("a");
			
			Assert.assertTrue(ultimoCaracter == 'a');
			
			
		} catch (NullPointerException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void ultimoCaracterNullPointer() {
		try {
			char ultimoCaracter = ManejoString.ultimoCaracter(null);			
			Assert.fail();		
		} catch (NullPointerException e) {
			Assert.assertTrue(true);
		}
	}
	
	
	
}
