package ar.edu.unlam.basica2.eva2;

import java.lang.Math;

public class Circulo extends Figura {
	private Double radio;
	private String color;
	public Circulo(Double radio, String Color) {
		this.radio = radio;
		this.color=color;
	}
	

	@Override
	public Double calcularElArea() {
		Double area = Math.PI*Math.pow(this.radio, 2);
		super.setArea(area);
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetro = 2*Math.PI*this.radio;
		super.setPerimetro(perimetro);
		return perimetro;
	}

	@Override
	public String dibujarFigura() {
		return "Soy un Circulo"; 
	}


	public Double getRadio() {
		return radio;
	}


	public void setRadio(Double radio) {
		this.radio = radio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + "]";
	}
	
	

}
