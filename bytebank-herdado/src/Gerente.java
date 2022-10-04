// Gerente � um funcion�rio, Gerente herda a classe Funcionario
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
		
	public double getBonificacao() { // Isso significa reescrita, pois temos o mesmo m�todo na classe m�e (Funcionario).
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		return super.getBonificacao() + super.getSalario();
		
		//return super.getBonificacao() + super.salario; =>  Super significa que esse atributo n�o est� definida nesta classe, e sim na classe m�e (Funcionario).
		
	}
}
