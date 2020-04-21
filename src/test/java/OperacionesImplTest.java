import static com.StaticFactoryBuilder.OPERACION;

import org.junit.Assert;
import org.junit.Test;

public class OperacionesImplTest {

	@Test
	public void testSumar() {
		String resultadoEsperado= "{\"operando1\":\"" + "3" + "\", \"operando2\":\"" + "2" + "\", \"suma\": \"" + "5" + "\"}";
		String resultadoActual = OPERACION.sumar("3","2");
		Assert.assertEquals(resultadoEsperado, resultadoActual);
	}

	@Test
	public void testRestar() {
		String resultadoEsperado= "{\"iOperando1\":\"" + "3" + "\", \"iOperando2\":\"" + "2" + "\", \"resultado\": \"" + "1" + "\"}";
		String resultadoActual = OPERACION.restar("3","2");
		Assert.assertEquals(resultadoEsperado, resultadoActual);
	}

}
