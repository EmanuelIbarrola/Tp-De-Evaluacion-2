package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFigura {
	
	
	@Test
	public void testQueVerificaQueUnaMismaFiguraSePuedaInstanciaTantoComoUnRectangoYTambienComoUncirculo() {
		
		Figura figuraCirculo = new Circulo(8.5, "Marron");
		
		Double valEsperado= 226.9;
		
		assertEquals(valEsperado,figuraCirculo.calcularElArea(),0.1);
		
		// Figura Rectangulo//
		
		Figura FiguraRectangulo= new Rectangulo(3.7, 6.9, "Blanco");
		
		Double valEsperado1= 25.53;
		assertEquals(valEsperado1, FiguraRectangulo.calcularElArea(),0.1);
		
	}

}
