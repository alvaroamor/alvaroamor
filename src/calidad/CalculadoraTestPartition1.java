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

public class CalculadoraTestPartition1 {

	//operaciones por categoria: RESTA

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
		
}
