package ar.edu.unlam.pb1.trabajoPractico08;

public class Tragamonedas {
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas(){
		this.tambor1 = new Tambor();
		this.tambor2 = new Tambor();
		this.tambor3 = new Tambor();
		
	}
	
	public String getPosicion() {
		return tambor1.getPosicionActual() +""+tambor2.getPosicionActual() + ""+tambor3.getPosicionActual();
	}
	
	public void girar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	
	public Integer obtenerPosicionDelTambor(Tambor tambor) {
		Integer posicion =0;
		posicion=tambor.getPosicionActual();
		return posicion;
	}
	
	public Tambor obtenerTambor1() {
		return this.tambor1;
	}
	public Tambor obtenerTambor2() {
		return this.tambor2;
	}
	public Tambor obtenerTambor3() {
		return this.tambor3;
	}
}
