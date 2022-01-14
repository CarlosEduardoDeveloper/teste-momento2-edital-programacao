package Exercicios;

public class Exercicio1 {
	public static void main(String[] args) {

		Integer A, B, C, D, maior, menor;
		A = 80;
		B = 50;
		C = 40;
		D = 40;

		if ((A > B) && (A > C) && (A > D)) {
			maior = A;
		} else if ((B > A) && (B > C) && (B > D)) {
			maior = B;
		} else if ((C > A) && (C > B) && (C > D)) {
			maior = C;
		} else {
			maior = D;
		}

		if ((A < B) && (A < C) && (A < D)) {
			menor = A;
		} else if ((B < A) && (B < C) && (B < D)) {
			menor = B;
		} else if ((C < A) && (C < B) && (C < D)) {
			menor = C;
		} else {
			menor = D;
		}

		System.out.println("O maior valor é: " + maior + ", e o menor valor é: " + menor);

	}

}
