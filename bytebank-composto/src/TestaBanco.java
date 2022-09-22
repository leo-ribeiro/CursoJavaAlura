
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente leonardo = new Cliente();
		leonardo.nome = "Lenardo Ribeiro";
		leonardo.cpf = "333.333.333-33";
		leonardo.profissao = "programador";
		
		Conta contaDoLeonardo = new Conta();
		contaDoLeonardo.deposita(100);
		
		// Associa o cliente leonardo a conta contaDoLeonardo
		contaDoLeonardo.titular = leonardo;
		System.out.println(contaDoLeonardo.titular.nome);
		System.out.println(contaDoLeonardo.titular); // Mostra a sujeirinha da String
	}

}
