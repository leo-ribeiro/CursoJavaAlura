
public class TesteFuncionario {

	public static void main(String[] args) {
	
		Funcionario leonardo = new Funcionario();
		leonardo.setNome("Leonardo Ribeiro");
		leonardo.setCpf("055049797-81");
		leonardo.setSalario(2600.00);	
		
		System.out.println(leonardo.getNome());
		System.out.println(leonardo.getBonificacao());

	}

}
