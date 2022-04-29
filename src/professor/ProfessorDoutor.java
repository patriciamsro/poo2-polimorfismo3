package professor;

public class ProfessorDoutor extends Professor{

	public static final Integer PERCENTUAL_MAXIMO_BONUS = 50;
	public static final Integer VALOR_MAXIMO_BONUS = 4000;
	
	private Double bonus;

	public ProfessorDoutor(String nome, String cpf, String endereco, String disciplina, Double salario) {
		super(nome, cpf, endereco, disciplina, salario);
	}
	
	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	private Double buscaTetoBonus() {
		Double CinquentaPorCentoSalario = getSalario() * ((double) PERCENTUAL_MAXIMO_BONUS / 100);
		Double teto;
		
		if(CinquentaPorCentoSalario > VALOR_MAXIMO_BONUS)
			teto = (double)VALOR_MAXIMO_BONUS;
		else teto = CinquentaPorCentoSalario;
		return teto;
	}

	public void adicionaBonus(Double bonusEmReais) {
					
		if(bonusEmReais > buscaTetoBonus())
			throw new IllegalArgumentException("O bônus não pode ser superior a " + PERCENTUAL_MAXIMO_BONUS + "%, limitado a R$" + VALOR_MAXIMO_BONUS + ".");
		else
			this.bonus = bonusEmReais;
	}

	public void adicionaBonus(Integer bonusEmPercentual) {
		
		Double bonusEmReais = getSalario() * ((double) bonusEmPercentual / 100);
	
		if( bonusEmReais > buscaTetoBonus())
			throw new IllegalArgumentException("O bônus não pode ser superior a " + PERCENTUAL_MAXIMO_BONUS + "%, limitado a R$" + VALOR_MAXIMO_BONUS + ".");
		else
			this.bonus = bonusEmReais;
	}
	
	@Override
	public Double calculaRemuneracaoTotal() {
		return getSalario() + bonus;
	}
	
	@Override
	public String toString() {
		return "Professor(a) Doutor(a): " + getNome()
		+ " CPF: " + getCpf()
		+ " Endereço: " + getEndereco()
		+ " Disciplina: " + getDisciplina() 
		+ " Salario: R$" + calculaRemuneracaoTotal();
	}
	
}
