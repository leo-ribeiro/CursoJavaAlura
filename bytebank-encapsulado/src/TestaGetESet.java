
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(0, 0);
		//conta.numero = 1337; ==> Assim n�o funciona pois "numero" � privado.
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente leonardo = new Cliente();
		//conta.titular = leonardo;
		leonardo.setNome("Leonardo Ribeiro");
		
		conta.setTitular(leonardo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// Agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(conta.getTitular());
		System.out.println(leonardo);
		System.out.println(titularDaConta);
		
		
	}

}
