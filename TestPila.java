package lab2Estructuras;

import junit.framework.TestCase;

public class TestPila extends TestCase {
	private Pila<Integer> calcu;
	public void escenario() {
		calcu= new Pila<Integer>();
	}
	
	public void testagregar () {
		escenario();
		calcu.agregar(3);
		assertTrue(calcu.obtener()==3);
	}

	public void testobtener() {
		escenario();
		calcu.agregar(3);
		assertTrue(calcu.obtener()==3);
	

	}

	public void testesVacia() {
		escenario();
		
		assertTrue(calcu.esVacia()==true);
	}

	public void testtoString() {
		
	}
}
