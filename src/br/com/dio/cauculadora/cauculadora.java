package br.com.dio.cauculadora;

import java.util.Scanner;

public class cauculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtração = subtração(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("sub: " + subtração);
		System.out.println("multi: " + multiplicacao);
		System.out.println("divi: " +  divisao);
	}
    public static int soma(int a, int b) {
    	return a + b;
    }
    public static int subtração (int a, int b) {
    	return a - b;
    }
    public static int divisao (int a, int b) {
    	return a / b;
    }
    public static int multiplicacao (int a, int b) {
    	return a * b;
    }
}
