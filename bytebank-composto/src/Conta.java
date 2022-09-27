
/*
public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= saldo) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public double pegaSaldo() {
           return this.saldo;
    }
    }

*/

 public class Conta {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;	// O jeito mais comum de se usar � assim: this.saldo = += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {   
			this.saldo -= valor; // O jeito mais comum de se usar � assim: if(this.saldo += valor;
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
		}
			return false;
		}
		
	public double pegaSaldo() {
		return this.saldo;
		}
}





