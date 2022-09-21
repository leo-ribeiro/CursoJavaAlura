package bytebank;

public class CriaConta2 {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 5000;
		primeiraConta.agencia = 8475;
		primeiraConta.numero = 71000;
		primeiraConta.titular = "Leonardo Pinheiro Ribeiro";
		System.out.println("O nome do titular é: " + primeiraConta.titular + " Agência: " + primeiraConta.agencia + " Conta: "
				+ primeiraConta.numero + " e o saldo da conta é: R$ " + primeiraConta.saldo);
	}

}
