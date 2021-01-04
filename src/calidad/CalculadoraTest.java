package calidad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculadoraTest {
	
	//error
	@Test
	public void operacionSumPosNeg() {
		System.out.println("Operacion: Suma numero positivo + numero negativo");
		Calculadora ObjOperacion = new Calculadora(8, -5);
		assertTrue(ObjOperacion.suma() == -3);
	}
	
	//error
	@Test
	public void operacionSumNegNeg() {
		System.out.println("Operacion: Suma numeros negativo + numero negativo");
		Calculadora ObjOperacion = new Calculadora(-8, -3);
		assertTrue(ObjOperacion.suma() == -25);
	}
	
	//acierto
	@Test
	public void operacionSumPosPos() {
		System.out.println("Operacion: Suma numero positivo + numero positivo");
		Calculadora ObjOperacion = new Calculadora(9, 5);
		assertTrue(ObjOperacion.suma() == 14);
	}
	
	//acierto
	@Test
	public void operacionResNegNeg() {
		System.out.println("Operacion: Res numero negativo - numero negativo");
		Calculadora ObjOperacion = new Calculadora(-1, -8);
		assertTrue(ObjOperacion.resta() == 7);
	}
	
	//acierto
	@Test
	public void operacionResReal() {
		System.out.println("Operacion: Resta resultado = positivo");
		Calculadora ObjOperacion = new Calculadora(8, 4);
		assertTrue(ObjOperacion.resta() == 4);
	}
	
	//error
	@Test
	public void operacionRaizCuad() {
		System.out.println("Operacion: Raiz cuadrada");
		Calculadora ObjOperacion = new Calculadora(64, 2);
		assertNull(ObjOperacion.raizCuadrada() == 7);
	}
	
	//error
	@Test
	public void operacionDivDec() {
		System.out.println("Operacion: Division decimales");
		Calculadora ObjOperacion = new Calculadora(6, 4);
		assertEquals(ObjOperacion.dividir() == 1,5);
	}
	
	//acierto
	@Test
	public void operacionDivEnt() {
		System.out.println("Operacion: Division entera");
		Calculadora ObjOperacion = new Calculadora(16, 4);
		assertFalse(ObjOperacion.dividir() != 4);
	}
	
	
	
	@BeforeClass
	public static void main() {
		System.out.println("Empieza la ejecucion...");
	}
	
	@AfterClass
	public static void returnEnd() {
		System.out.println("Fin de la ejecucion...");
	}
	
	@Before
	public void updateBefore() {
		Calculadora.numero=6;
		Calculadora.numero1=7;
	}
	
	@After
	public void updateAfter() {
		Calculadora.numero= 5;
		Calculadora.numero1= 9;
	}
	
	@Ignore
	public static void doing() {
		System.out.println("En construccion");
	}
}
