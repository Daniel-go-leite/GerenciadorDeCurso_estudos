package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
	
		Aula a1 =new Aula("Revisitando as ArrayLists", 21);
		Aula a2 =new Aula("Listas de objetos", 20);
		Aula a3 =new Aula("Relacionamento de lista e objetos", 15);

	
	     ArrayList<Aula> aula = new ArrayList<>();
	     aula.add(a1);
	     aula.add(a2);
	     aula.add(a3);
	     
	     //	System.out.println(aula);
	
	        Collections.sort(aula);
	        
	        System.out.println(aula);
	        
	        Collections.sort(aula, Comparator.comparing(Aula::getTempo));
	        
	        System.out.println(aula);
	}

}
