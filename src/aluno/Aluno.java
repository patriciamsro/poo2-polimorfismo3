package aluno;

import pessoa.Pessoa;

public class Aluno extends Pessoa {

	private Integer serie;
	private Integer sala;
	
	public Aluno(String nome, String cpf, String endereco, Integer serie, Integer sala) {
		super(nome, cpf, endereco);
		this.serie = serie;
		this.sala = sala;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Aluno(a): " + getNome()
		+ " CPF: " + getCpf()
		+ " Endereço: " + getEndereco()
		+ " Série: " + serie 
		+ " Sala: " + sala;
	}
	
}
