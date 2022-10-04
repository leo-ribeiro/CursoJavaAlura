
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario leonardo = new Funcionario();
		leonardo.setNome("Leonardo Ribeiro");
		leonardo.setCpf("055049797-81");
		leonardo.setSalario(2600.0);
		
		System.out.println(leonardo.getNome());
		System.out.println(leonardo.getBonificacao());
		
		// leonardo.salario = 300.0;

	}

}
