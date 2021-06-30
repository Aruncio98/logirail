package com.example;

import java.util.Random;
import java.util.Scanner;

public class Testeo {
	// Enumeracion
	public enum gender {
		MASCULINO,FEMENINO,OTRO
		} 
	// MAIN
	public static void main(String[] args) {
		// Invocamos el metodo
		iniciar();
		jugada();
		// Enumeracion
		
	}

// Creamos el metodo juega
	public static void juega() {
		// Recogemos datos de teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame cadena");
		String cad = teclado.nextLine();
		// Creamos una variable para almacenar un numero aleatorio
		var rnd = new Random();
		int num = rnd.nextInt(10);
		// Mostramos cadena
		System.out.println("Valor: " + num);
		//

	}

// Creamos el metodo para convertir en cadena
	public static void conv() {
		// encapsulamos la cadena en una variable
		String cadena = "3+4+3,4-7*1=";
		// Creamos un array donde almacenamos la cadena para su division
		String[] cadenaPartida = cadena.split("\\t|\\-");

		// BUcle para recorrer el array hastga que encuentre el espacio para dividir la
		// cadena
		for (int i = 0; i < cadenaPartida.length; i++) {
			System.out.println(cadenaPartida[i]);

		}

	}

	// Metodo adivinar numero
	public static void adivina() {
		int num;
		int intentos = 10;
		// Metemos un bucle para los intentos
		for (int i = intentos; i >= 0; i--) {
			do {
				// Pedimos un numero
				Scanner teclado = new Scanner(System.in);
				System.out.println("Dame un numero.Tienes 10 intentos");
				num = teclado.nextInt();
			} while ((num < 0) || (num >= 100));
			// Mi numero
			int miNum = 15;
			// Comprobamos si el numero es mayor menor, o igual que 15
			if (num > miNum) {
				System.out.println(
						"El numero que has escrito es mayor al que tengo pensado. Te quedan " + i + " intentos");
			} else if (num < miNum) {
				System.out.println(
						"El numero que has escrito es menor al que tengo pensado Te quedan " + i + " intentos.");

			} else {
				System.out.println("Enhorabuena, acertaste el numero, felicidades");
			}
			// si el numero de intentos es 0, detenemos
			if (i == 0) {
				System.out.println("Se acabo tu turno :(");

			}
		}

	}

	// Metodo mejorado de adivinar
	public static void adivinaNuevo() {
		// Llamamos a los metodos
		iniciar();
		jugada();
	}
	// Creamos el metodo iniciar jugada
	// Metodo para iniciar
	private static void  iniciar() {
		int num;
		// Al no tener interfaz, generamos un numero al azar
		var rand = new Random();
		// Almacenamos un numero del 1 al 100 en esa variable
		num = rand.nextInt(100);
		// Preguntamos
	}
	// Metodo para la jugada
	private static void jugada() {
		// Empezamos el conteo de la jugada
		int contador = 10;
		// Bucle para administrar las jugadas
		for (int i = contador; i > 0; i--) {
			System.out.println("Te quedan "+i+" intentos");
			
		}
		
	}
	// VOID de ejemplos
	private static void ejemplo() {
		gender gender = gender.FEMENINO;
		
	}
		
	
}
