
// New ContaCorrente()
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) { // Contrutores não são herdados, precisamos construir, mas através do super conseguimos...
		super(agencia, numero);
	}
	
	@Override 
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
