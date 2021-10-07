package ar.edu.unlam.pb1.trabajoPractico08;

import java.util.Scanner;

public class PruebaTragamonedas {

	public static void main(String[] args) {
		Tragamonedas prueba = new Tragamonedas();
		Scanner teclado = new Scanner (System.in);
		probarSuerte(prueba, teclado)

	}

	private static void probarSuerte(Tragamonedas prueba, Scanner teclado) {
		System.out.println("Presione 'G' para girar");
		String ingreso = teclado.next().toUpperCase();
		if(ingreso.equals("G")) {
			
			prueba.girar();
			System.out.println(prueba.obtenerPosicionDelTambor(prueba.obtenerTambor1()) + "-" + prueba.obtenerPosicionDelTambor(prueba.obtenerTambor2())+ "-"+ prueba.obtenerPosicionDelTambor(prueba.obtenerTambor3()));
			if(prueba.obtenerPosicionDelTambor(prueba.obtenerTambor1())==prueba.obtenerPosicionDelTambor(prueba.obtenerTambor2())&&prueba.obtenerPosicionDelTambor(prueba.obtenerTambor2())==prueba.obtenerPosicionDelTambor(prueba.obtenerTambor3())) {
				System.out.println("Has ganado!!!");
				System.out.println("Entregando Premio");
			}else {
				System.out.println("Hoy no tienes suerte");
			
			
			probarSuerte(prueba, teclado);
		}
		}
	else {
			System.out.println("Debe presionar la letra 'G' para girar. Intente nuevamente");
			probarSuerte(prueba, teclado);
		}
			}
			
	}