package br.com.dio;

import br.com.dio.model.Gato;

public class PriPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		/*int a = 10;
		int b = 6/9;
		System.out.println("Hello word " + (a+b));*/

	}

}


class Livros {
	private String nome;
	private String npag;
}