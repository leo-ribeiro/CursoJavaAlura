package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoLeonardo = new Conta();
		contaDoLeonardo.saldo = 100;
		contaDoLeonardo.deposita(50);
		System.out.println(contaDoLeonardo.saldo);
		
		boolean conseguiuRetirar = contaDoLeonardo.saca(20);
		System.out.println(contaDoLeonardo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoLeonardo);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLeonardo.saldo);
	}
	
		
}
