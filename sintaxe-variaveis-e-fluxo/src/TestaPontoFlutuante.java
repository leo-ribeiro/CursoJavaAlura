
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu sal�rio � " + salario);
		
		double idade = 37; // Podemos armazenar um Int em uma vai�vel double, ao contr�rio n�o!
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;  // Nesse caso ele vai pegar o resultado inteiro
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2;  // Nesse caso ele n�o converteria corretamente
		System.out.println(novaTentativa);
		
		double novaTentativa2 = 5.0 / 2;  // Assim dar� certo
		System.out.println(novaTentativa2);
	}

}
