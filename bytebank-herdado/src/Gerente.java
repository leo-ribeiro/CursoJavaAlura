// Gerente é um funcionário, Gerente herda a classe Funcionario
public class Gerente extends Funcionario{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
		
	public double getBonificacao() { // Isso significa reescrita, pois temos o mesmo método na classe mãe (Funcionario).
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getBonificacao() + super.getSalario();
		
		//return super.getBonificacao() + super.salario; =>  Super significa que esse atributo não está definida nesta classe, e sim na classe mãe (Funcionario).
		
	}
}
