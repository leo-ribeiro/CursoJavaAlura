

public class Conta {

	double saldo = 100;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;	// O jeito mais comum de se usar é assim: this.saldo = += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {   
			this.saldo = this.saldo -  valor; // O jeito mais comum de se usar é assim: if(this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}
