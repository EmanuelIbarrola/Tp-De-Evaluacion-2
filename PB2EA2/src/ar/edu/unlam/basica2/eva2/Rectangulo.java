package ar.edu.unlam.basica2.eva2;

public class Rectangulo extends Figura {
	private Double ladoA;
	private Double ladoB;
	private String color;

	public Rectangulo(Double ladoA, Double ladoB, String Color) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = Color;
	}

	@Override
	public Double calcularElArea() {
		Double area = this.ladoA * this.ladoB;
		super.setArea(area);
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetro = 2 * (this.ladoA + this.ladoB);
		super.setPerimetro(perimetro);
		return perimetro;
	}

	@Override
	public String dibujarFigura() {
		 return "Soy un Rectangulo";
	}

	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
	
	

}
