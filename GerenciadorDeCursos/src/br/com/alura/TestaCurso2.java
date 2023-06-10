package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Cusrso javaColecoes = new Cusrso("Dominando as coleçoes do java ", "Daniel");
		
		   /* List<Aula>aula = javaColecoes.getAulas();
		     System.out.println(aula);*/
		     
		     javaColecoes.adiciona(new Aula("trabalhando com ArrayList",21));
		     javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		     javaColecoes.adiciona(new Aula("Modelando com colecoes",22));
		     
		     List<Aula>aulaImutaveis=javaColecoes.getAulas();
		     System.out.println(aulaImutaveis);
	
	         List<Aula> aula = new ArrayList<>(aulaImutaveis);
	
	         Collections.sort(aula);
	         System.out.println(aula);
	         System.out.println(javaColecoes.getTempoTotal());
	}
} 
