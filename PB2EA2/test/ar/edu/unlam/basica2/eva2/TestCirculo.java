package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCirculo {

	@Test
	public void TestQueVerificaElAreaDeUnCirculo() {
		Circulo circulo1 = new Circulo(5.0, "AZUL");

		Double valEsperado = 78.5;

		assertEquals(valEsperado, circulo1.calcularElArea(),0.1);

	}

	
	@Test
	public void TestQueVerificaElPerimetroDeUnCirculo() {
		Circulo circulo1 = new Circulo(15.9, "Rojo");

		Double valEsperado = 99.9;

		assertEquals(valEsperado, circulo1.calcularElPerimetro(), 0.1);

	}
	@Test
	public void TestQueVerificaElSaverDibujar() {
		Circulo circulo1 = new Circulo(10.9, "Dorado");

	String  valEsperado = "Soy un Circulo";

		assertEquals(valEsperado, circulo1.dibujarFigura());

	}
}// fin class
