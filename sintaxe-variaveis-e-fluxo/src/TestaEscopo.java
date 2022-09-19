public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;

		//System.out.println("valor de acompanhado = " + acompanhado);
		
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
		    acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
	}
}