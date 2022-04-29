package professor;

import pessoa.Pessoa;

public class Professor extends Pessoa {

	private String disciplina;
	private Double salario;
	
	public Professor(String nome, String cpf, String endereco, String disciplina, Double salario) {
		super(nome, cpf, endereco);
		this.disciplina = disciplina;
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = calculaRemuneracaoTotal();
	}
	
	public Double calculaRemuneracaoTotal() {
		return salario;
	}
	
	@Override
	public String toString() {
		return "Professor(a): " + getNome()
		+ " CPF: " + getCpf()
		+ " Endereço: " + getEndereco()
		+ " Disciplina: " + disciplina 
		+ " Salario: R$" + salario;
	}

}
