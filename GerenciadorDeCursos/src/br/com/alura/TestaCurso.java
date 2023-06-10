package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Cusrso javaColecoes = new Cusrso("Dominando as coleçoes do java ", "Daniel");
		
		   /* List<Aula>aula = javaColecoes.getAulas();
		     System.out.println(aula);*/
		     
		     javaColecoes.adiciona(new Aula("trabalhando com ArrayList",21));
		     javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		     javaColecoes.adiciona(new Aula("Modelando com colecoes",22));
		     
		     List<Aula>aula=javaColecoes.getAulas();
		     System.out.println(javaColecoes.getAulas());
	}
} 
