package calidad;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	public static void main(String[] args) {
		
		Result res = JUnitCore.runClasses(CalculadoraTest.class);
		
		for(Failure failure : res.getFailures()) {
			System.out.println("\nFALLO ENCONTRADO\n");
			System.out.println(failure.toString());
			System.out.println("\nFIN FALLO\n");

		}
		
		System.out.println(res.wasSuccessful());
	}

}
