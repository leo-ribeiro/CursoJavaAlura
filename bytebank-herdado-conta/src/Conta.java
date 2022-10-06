 public abstract class Conta {

	 // Atributos da classe Conta
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; 
	
	
	// Contrutores da classe Conta
	public Conta (int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);		
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}
	
	// M�todos concretos
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {   
			this.saldo -= valor; 
			return true;
		} else {
			return false;
		}			
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
		}
		
	public double getSaldo() {
		return this.saldo;
		}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}





