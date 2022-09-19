
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu salário é " + salario);
		
		double idade = 37; // Podemos armazenar um Int em uma vaiável double, ao contrário não!
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;  // Nesse caso ele vai pegar o resultado inteiro
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2;  // Nesse caso ele não converteria corretamente
		System.out.println(novaTentativa);
		
		double novaTentativa2 = 5.0 / 2;  // Assim dará certo
		System.out.println(novaTentativa2);
	}

}
