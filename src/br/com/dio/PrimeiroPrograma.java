package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
	    gato gato = new gato();
		Livros livros = new Livros();  
		
		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livros {
	private String livro;
	private String nump�ginas;
}