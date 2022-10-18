
public class Gerente implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Gerente(){

        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
}