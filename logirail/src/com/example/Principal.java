package com.example;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/** Declaracion de variables
		 * Primera linea de variable
		**/
		String opt;
		// Variable de lectura de datos
				Scanner leer = new Scanner (System.in);
				// Esta variable permite grabar un dato de entrada en la variable leer
		// bucle para pedir datos
		do {
			 System.out.println("Introduce C para circulo, R para rectangulo y T para triangulo");
			 // Leemos la opcion
			 opt = leer.next() ;
		
		// Bucle de opciones
		switch (opt) {
		// Para la opcion C calculamos area circulo		
		case "C" :
			// Pedimos el radio del circulo
			int radio;
			System.out.println("Introduce el radio");
			radio = leer.nextInt();
			// Calculamos el area y mostramos por pantalla
			double areaC = Math.PI * Math.pow(radio, 2);
			System.out.println("El area del circulo es " +areaC);	
		break ;
		
		case "R" :
			// En la opcion R calculamos el area del rectangulo
			int base, altura;
			//Pedimos base y altura
			System.out.println("Introduce la base");
			base = leer.nextInt();
			System.out.println("Introduce la altura");
			altura = leer.nextInt();
			// Calculamos area y mostramos por pantalla
			long areaR  = Math.multiplyFull(base, altura);
			System.out.println("El area del rectangulo es "+areaR);
			break;
		case "T":
			// En la opcion T calculamos el area del triangulo
			int baseT, alturaT;
			// Pedimos base y altura
			System.out.println("Introduce la base");
			baseT = leer.nextInt();
			System.out.println("Introduce la altura");
			alturaT = leer.nextInt();
			// Calculamos area del triangulo y mostramos por pantalla
			long areaT = (Math.multiplyFull(baseT, alturaT)) / 2;
			System.out.println("El area del triangulo es "+areaT);
			break;
		case "F":
			System.out.println("FIN");
			break;
		default:
			System.out.println("FIN");
			break;
		}
		} while ((opt != "C")&&(opt != "R")&&(opt != "T")&&(opt != "F"));
	}
}


