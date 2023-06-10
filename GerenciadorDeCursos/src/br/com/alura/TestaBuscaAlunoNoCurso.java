package br.com.alura;

public class TestaBuscaAlunoNoCurso {

	public static void main(String[] args) {

		Cusrso javaColecoes = new Cusrso("Dominando as coleçoes do java ", "Daniel");

		/*
		 * List<Aula>aula = javaColecoes.getAulas(); System.out.println(aula);
		 */

		javaColecoes.adiciona(new Aula("trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

	    System.out.println("Quem e o aluno com matricula 5617?");
	    Aluno aluno = javaColecoes.estaMatriculado(5617);
	    System.out.println("aluno:" + aluno);
	
	
	
	}
}