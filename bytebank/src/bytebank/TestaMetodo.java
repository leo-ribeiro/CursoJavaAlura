package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoLeonardo = new Conta();
		contaDoLeonardo.saldo = 100;
		contaDoLeonardo.deposita(50);
		System.out.println(contaDoLeonardo.saldo);
	}

}
