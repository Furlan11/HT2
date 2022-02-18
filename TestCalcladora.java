package lab2Estructuras;

import junit.framework.TestCase;

public class TestCalcladora extends TestCase {
	private Calcladora calcu;
	public void escenario() {
		calcu= new Calcladora();
	}
	
	public void testIsNumeric() {
		escenario();
		assertTrue(calcu.isNumeric("2")==true);
	}
	public void testCalcular() {
		escenario();
		assertTrue(15 == Integer.parseInt(calcu.calcular("1 2 + 4 * 3 +")));
		
		
	}

}
