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

public class CalculadoraTestPartition {

	//operaciones por categoria: SUMA
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
		
}
