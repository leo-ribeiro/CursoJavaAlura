
// Gerente � um funcion�rio, Gerente herda a classe Funcionario
public class Gerente extends implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao(){
        // implementa��o da bonifica��o do gerente omitida
    }

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){

        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
