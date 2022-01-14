package Exercicios;

public class Exercicio2 {
	public static void main(String[] args) {
		
	int a, b, c;
	a=5;
	b=4;
	c=2;
	
	if(a<b && b<c && a<c){
		System.out.println("A sequencia crescente é: " + a + b + c);
	}else if(a<b && c<b && a<c){
		System.out.println("A sequencia crescente é: " + a + c + b);
	} else if(b<a && a<c && b<c) {
		System.out.println("A sequencia crescente é: " + b + a + c);
	} else if(b<a && c<a&& b<c) {
		System.out.println("A sequencia crescente é: " + b + c + a);
	} else if(c<a && a<b && c<b) {
		System.out.println("A sequencia crescente é: " + c + a + b);
	}else{
		System.out.println("A sequencia crescente é: " + c + b + a);
	}
		
}
}