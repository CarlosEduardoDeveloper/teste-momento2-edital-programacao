package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número:");
		
		int numero = scanner.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é impar!");
		}
		
		if(numero>=0) {
			System.out.println("O numero é positivo!");
		}else {
			System.out.println("O número é negativo!");
		}
		
	}
}
