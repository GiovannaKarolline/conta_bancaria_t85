package conta_bancaria.model;

public class ContaCorrente extends Conta{
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void visualizar(){
		super.visualizar();
		System.out.printf("Limite da conta: %.2f\n\n", this.limite);
	}
	
	@Override
	public boolean sacar(float valor) {
		if(super.getSaldo() + this.limite < valor) {
			return false;
		}
		
		/* não inclui o limite porque ele é separado do saldo, 
		o saldo fica negativo quando é ele e o limite são gastos
		*/
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
}
