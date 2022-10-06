
// Não pode instaciar dessa classe, pq é abstrata.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	// protected double salario; => Protected significa público para os filhos, para os outros privado.
	
	// Método sem corpo, não há implementação desse método.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
