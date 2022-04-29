package polimorfimo;

import java.util.ArrayList;
import java.util.List;

import aluno.Aluno;
import professor.Professor;
import professor.ProfessorDoutor;
import professor.ProfessorMestre;

public class Teste {
	
	public static List<Aluno> cadastraAlunos() {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("Ana Maria Silva", "11122233309", "Av. Dos Mares, 23", 1, 10);
		Aluno a2 = new Aluno("Joana Oliveira", "22277733309", "Rua dos Eucaliptos, 707", 1, 10);
		Aluno a3 = new Aluno("Mariana Rezende", "88822233309", "Av. Brasil, 230 AP 502", 1, 10);
		Aluno a4 = new Aluno("José Martins", "44422233309", "Rua das Amoras, 110", 2, 20);
		Aluno a5 = new Aluno("Antônio Pereira", "33322233309", "Av. Plutão, 43", 2, 20);
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);

		return alunos;
	}
	
	public static void imprimeAlunos(List<Aluno> alunos) {
		System.out.println("Lista de alunos matriculados: \n");
		
		for(int i = 0; i< alunos.size(); i++)
			System.out.println(i+1 + " - " + alunos.get(i).toString());
	}
	
	public static List<Professor> cadastraProfessor() {
		
		List<Professor> professores = new ArrayList<Professor>();
		
		Professor prof1 = new Professor("José Joaquim Ferreira", "98765432112","Av. Floriano Peixoto, 1000", "Estatística", 5000.00);
		ProfessorMestre prof2 = new ProfessorMestre("Ana Maria Silva", "12345678910","Av. Engenheiro Azeli, 230", "Matemática Financeira", 7000.00);
		ProfessorDoutor prof3 = new ProfessorDoutor("João da Silva", "00100200304","Av. Floriano Peixoto, 200", "Economia", 10000.00);
		
		prof2.adicionaBonus(500.00);
		prof3.adicionaBonus(20);
		
		professores.add(prof1);
		professores.add(prof2);
		professores.add(prof3);
		
		return professores;
	}
	
	public static void imprimeProfessores(List<Professor> professores) {
		System.out.println("\nLista de professores contratados: \n");
		
		for(int i = 0; i< professores.size(); i++)
			System.out.println(i+1 + " - " + professores.get(i).toString());
	}
	
	public static void main(String[] args) {

		List<Aluno> alunos = cadastraAlunos();
		imprimeAlunos(alunos);
		
		List<Professor> professores = cadastraProfessor();
		imprimeProfessores(professores);		
	}

}
