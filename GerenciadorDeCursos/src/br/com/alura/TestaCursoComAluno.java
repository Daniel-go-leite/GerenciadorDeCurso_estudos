package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Cusrso javaColecoes = new Cusrso("Dominando as coleçoes do java ", "Daniel");
		
		   /* List<Aula>aula = javaColecoes.getAulas();
		     System.out.println(aula);*/
		     
		     javaColecoes.adiciona(new Aula("trabalhando com ArrayList",21));
		     javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		     javaColecoes.adiciona(new Aula("Modelando com colecoes",22));
		     
	         Aluno a1 = new Aluno("Rodrigo Turini", 34672);
	         Aluno a2 = new Aluno("Guilherme Silveira", 5617);
	         Aluno a3 = new Aluno("Mauricio Aniche", 17645);
	
	        javaColecoes.matricula(a1);
	        javaColecoes.matricula(a2);
	        javaColecoes.matricula(a3);
	
	        System.out.println("Todos os alunos matriculados:");
	        javaColecoes.getAlunos().forEach(a->{
	        	System.out.println(a);
	        });
	
	     //  System.out.println(javaColecoes.estaMatriculado(a1));
	       
	       Aluno turini = new Aluno("Rodrigo Turini" , 34672);
	       
	       System.out.print(a1.equals(turini));
	       
	       System.out.println(a1.hashCode()== turini.hashCode());
	}
}
