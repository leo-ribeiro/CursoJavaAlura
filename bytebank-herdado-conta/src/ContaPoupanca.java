
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) { // Contrutores n�o s�o herdados, precisamos construir, mas atrav�s do super conseguimos...
		super(agencia, numero);
	}

}
