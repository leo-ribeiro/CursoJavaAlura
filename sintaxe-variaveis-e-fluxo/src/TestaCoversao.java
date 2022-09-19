
public class TestaCoversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		
		System.out.println(valor);
		
		long numeroGrande = 32464564L;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;  // Dá errado, mas depois ele vai explicar
		
		System.out.println(total);
	}

}
