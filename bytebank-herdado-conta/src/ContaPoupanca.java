
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) { // Contrutores não são herdados, precisamos construir, mas através do super conseguimos...
		super(agencia, numero);
	}

}
