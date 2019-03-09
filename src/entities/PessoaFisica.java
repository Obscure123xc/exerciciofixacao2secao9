package entities;

public class PessoaFisica extends Contribuinte {

	private double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda, double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		if (super.getRenda() > 20000.00) {
			return (getRenda() * 0.25) - (getGastoSaude() * 0.5);
		} else {
			return (getRenda() * 0.15) - (getGastoSaude() * 0.5);
		}
	}
}
