package ar.edu.unlam.pb1.trabajoPractico08;

public class Tambor {
	private final Integer POSICION_MINIMA;
	private final Integer POSICION_MAXIMA;
	private Integer posicionActual;
	
	
	public Tambor () {
		this.POSICION_MINIMA=1;
		this.POSICION_MAXIMA=8;
		this.posicionActual=0;
	}
	
	public Integer getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(Integer posicionActual) {
		this.posicionActual = posicionActual;
	}
	
	public void girar () {
		Integer aleatorio = (int)(Math.random()*this.POSICION_MAXIMA)+this.POSICION_MINIMA;
		this.setPosicionActual(aleatorio);

	}	
	
	
}
