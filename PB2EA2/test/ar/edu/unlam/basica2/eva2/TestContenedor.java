package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContenedor {

	@Test
	public void testQueSeAgregueUnRectangulo() {

		ContenedorFigura contenedor = new ContenedorFigura();

		Rectangulo rectangulo = new Rectangulo(4.4, 5.9, "negro");

		assertTrue(contenedor.agregar(rectangulo));

	}

	@Test
	public void testQueSeAgregueUnCirculo() {

		ContenedorFigura contenedor = new ContenedorFigura();

		Circulo circulo = new Circulo(7.7, "celeste");

		assertTrue(contenedor.agregar(circulo));

	}

	@Test
	public void testQueSeAgregueUnaFigura() {

		ContenedorFigura contenedor = new ContenedorFigura();

		Figura figuraCirculo = new Circulo(33.5, "Rosado");

		assertTrue(contenedor.agregar(figuraCirculo));
	}

	@Test
	public void testQueVerificaQueSeObtieneRectangulos() {

		ContenedorFigura contenedor = new ContenedorFigura();

		Rectangulo rectangulo1 = new Rectangulo(5.7, 6.9, "blanco");
		Rectangulo rectangulo2 = new Rectangulo(3.9, 7.9, "rojo");
		Rectangulo rectangulo3 = new Rectangulo(2.9, 5.9, "verde");

		Circulo circulo1 = new Circulo(4.4, "gris");

		contenedor.agregar(circulo1);

		contenedor.agregar(rectangulo3);
		contenedor.agregar(rectangulo2);
		contenedor.agregar(rectangulo1);

		Integer valEsperado = 3;
		assertTrue(valEsperado.equals(contenedor.obtenerRectangulos().size()));

	}

	@Test
	public void testQueVerificaQueSeObtieneCirculos() {

		ContenedorFigura contenedor = new ContenedorFigura();

		Circulo circulo1 = new Circulo(2.2, "naranja");
		Circulo circulo2 = new Circulo(4.3, "celeste");
		Circulo circulo3 = new Circulo(7.9, "lila");
		Circulo circulo4 = new Circulo(10.50, "gris");

		Rectangulo rectangulo1 = new Rectangulo(5.7, 6.9, "blanco");

		contenedor.agregar(rectangulo1);

		contenedor.agregar(circulo1);
		contenedor.agregar(circulo2);
		contenedor.agregar(circulo3);
		contenedor.agregar(circulo4);

		Integer valEsperado = 4;
		assertTrue(valEsperado.equals(contenedor.obtenerCirculos().size()));

	}

	@Test
	public void testQueElPromedioDetodasLasFiguras() {

		ContenedorFigura contenedor = new ContenedorFigura();

		Circulo circulo1 = new Circulo(20.5, "platiado");
		Rectangulo rectangulo1 = new Rectangulo(15.77, 16.9, "dorado");

		contenedor.agregar(circulo1);
		contenedor.agregar(rectangulo1);

		circulo1.calcularElArea();
		rectangulo1.calcularElArea();

		Double valEsperado = 793.3;
		assertEquals(valEsperado, contenedor.calcularPromedioDeAreaDeTodasLasFiguras(), 0.1);

	}

}
