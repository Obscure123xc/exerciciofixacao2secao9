package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto() {
		if (getNumeroFuncionarios() > 10) {
			return getRenda() * 0.14;
		} else {
			return getRenda() * 0.16;
		}
	}
	
}
