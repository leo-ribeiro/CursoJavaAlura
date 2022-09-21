package bytebank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
