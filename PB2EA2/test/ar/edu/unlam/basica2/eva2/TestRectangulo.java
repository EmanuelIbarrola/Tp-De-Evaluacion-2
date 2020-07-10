package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRectangulo {

	@Test
	public void TestQueVerificaElPerimetroDeUnRectangulo() {
		Rectangulo rectangulo1 = new Rectangulo(5.5, 7.9, "Amarillo");

		Double valEsperado = 26.8;

		assertEquals(valEsperado, rectangulo1.calcularElPerimetro());

	}
	
	@Test
	public void TestQueVerificaElAreaDeUnRectangulo() {
		Rectangulo rectangulo1 = new Rectangulo(6.9, 25.4, "Platiado");

		Double valEsperado = 175.26;

		assertEquals(valEsperado, rectangulo1.calcularElArea());

	}
	
	
	@Test
	public void TestQueVerificaElSaverDibujarDeUnRectangulo() {
		Rectangulo rectangulo1 = new Rectangulo(4.4, 8.8, "Bordo");

		String  valEsperado = "Soy un Rectangulo";

		assertEquals(valEsperado, rectangulo1.dibujarFigura());

	}
}
