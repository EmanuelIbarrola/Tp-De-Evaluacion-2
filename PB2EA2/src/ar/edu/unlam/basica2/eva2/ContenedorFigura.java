package ar.edu.unlam.basica2.eva2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContenedorFigura {
	private List<Figura> ListaFiguras;
	private ArrayList<Rectangulo> listaRectangulos;
	private LinkedList<Circulo> listaCirculos;

	public ContenedorFigura() {
		this.ListaFiguras = new ArrayList<Figura>();
		this.listaRectangulos = new ArrayList<>();
		this.listaCirculos = new LinkedList<>();
	}

	public Boolean agregar(Figura figura) {
		return ListaFiguras.add(figura);
	}

	public ArrayList<Rectangulo> obtenerRectangulos() {

		Iterator<Figura> tt = ListaFiguras.iterator();
		while (tt.hasNext()) {
			Figura figura = tt.next();
			if (figura instanceof Rectangulo) {
				if (!listaRectangulos.contains(figura))
					listaRectangulos.add((Rectangulo) figura);
			}
		}

		return listaRectangulos;

	}

	public LinkedList<Circulo> obtenerCirculos() {

		Iterator<Figura> et = ListaFiguras.iterator();
		while (et.hasNext()) {
			Figura figura = et.next();
			if (figura instanceof Circulo) {
				if (!listaCirculos.contains(figura))
					listaCirculos.add((Circulo) figura);
			}
		}
		return listaCirculos;
	}

	public Double calcularPromedioDeAreaDeTodasLasFiguras() {
		Double total = 0.0;
		Double resultado=0.0;
		
		Iterator<Figura> rt = ListaFiguras.iterator();
		while (rt.hasNext()) {
			Figura fi = rt.next();
			if (fi != null) {
				total += fi.getArea();
				resultado = total  / ListaFiguras.size();
			}
		}

		return resultado;
	}

	public List<Figura> getListaFiguras() {
		return ListaFiguras;
	}

	public void setListaFiguras(List<Figura> listaFiguras) {
		ListaFiguras = listaFiguras;
	}

	public ArrayList<Rectangulo> getListaRectangulos() {
		return listaRectangulos;
	}

	public void setListaRectangulos(ArrayList<Rectangulo> listaRectangulos) {
		this.listaRectangulos = listaRectangulos;
	}

	public LinkedList<Circulo> getListaCirculos() {
		return listaCirculos;
	}

	public void setListaCirculos(LinkedList<Circulo> listaCirculos) {
		this.listaCirculos = listaCirculos;
	}

}
