
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaBruna = new Conta();
		System.out.println(contaDaBruna.pegaSaldo());
		
		contaDaBruna.titular = new Cliente();
		System.out.println(contaDaBruna.titular);
		
		contaDaBruna.titular.nome = "Bruna";
		System.out.println(contaDaBruna.titular.nome);
	}
}
