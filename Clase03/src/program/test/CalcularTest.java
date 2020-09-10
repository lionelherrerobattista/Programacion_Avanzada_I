package program.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import org.junit.Assert;


import program.Calcular;
import program.MiUnchecked;

public class CalcularTest {
	
	
	@Test
	public void dividirOk() {
		Calcular c = new Calcular();
		
		try {
			double resultado = c.dividir(1, 1);
			Assert.assertEquals(1.0, resultado, 0);	
		} catch (MiUnchecked e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void dividirPorCero() {
		Calcular c = new Calcular();
		
		try {
			double resultado = c.dividir(1, 0);
			Assert.fail("No lanzo MI UNCHECKED");
		} catch (MiUnchecked e) {
			Assert.assertTrue(true);
		}
	}

}
