package ar.edu.unlam.basica2.eva2;

public abstract class Figura {

	private String color;
	private Double area;
	private Double perimetro;

	public Figura(String color) {
		this.color = color;
	}

	public Figura() {
		this.color = "Negro";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	

	public Double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}

	public abstract Double calcularElArea();

	public abstract Double calcularElPerimetro();

	// Devuelve Un String Informando EL nombre con el cual se instancio Una figura
	public abstract String dibujarFigura();

}
