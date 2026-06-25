package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	private int diaDoAniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int diaDoAniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.diaDoAniversario = diaDoAniversario;
	}

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Dia do aniversário: %d\n\n", diaDoAniversario);
	}
	
}
