import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.top3.Counter;

public class CounterTestCase {
	private Counter counter;
	private Counter counterVacio;
	
	
	
	@BeforeEach
	public void setUp()  {
	counter = new Counter();
	counterVacio = new Counter();
			
	counter.addInteger(1);
	counter.addInteger(3);
	counter.addInteger(14);
	counter.addInteger(5);
	counter.addInteger(7);
	counter.addInteger(22);
	counter.addInteger(75);
	counter.addInteger(40);
	
	}
	
	@Test
	public void cuandoSeCreaUnTestEstaVacio() {
		
		assertEquals(0, counterVacio.getNumeros().size());
	}
	@Test
	public void unContadorTiene8NumerosAgregados() {
		assertEquals(8, counter.getNumeros().size());
	}
	@Test
	public void unContadorSabeCalculaLaCantidadDeNumerosPares() {
		assertEquals(3, counter.contarPares(counter.getNumeros()));
	}
	public void unContadorSabeCalculaLaCantidadDeNumerosImpares() {
		assertEquals(5, counter.contarImpares(counter.getNumeros()));
	}
	@Test
	public void unContadorSabeCalculaLaCantidadDeNumerosMultiplosDe5() {
		assertEquals(3, counter.contarMultiplos_De(counter.getNumeros(), 5));
	}
 	
}
