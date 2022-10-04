
public class TesteReferencias {

	public static void main(String[] args) {
		
		// Funcionario g1 = new Gerente(); => Isso funciona pq o Gerente é um Funcionário
		
		Gerente g1 = new Gerente();
		g1.setNome("Bruna Rocha");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}

}
