
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta(); // As variav�is "Conta e Conta() tem que ser uma classe existente no sistema e "conta" poderia ser qualquer nome.
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());

	}
}
