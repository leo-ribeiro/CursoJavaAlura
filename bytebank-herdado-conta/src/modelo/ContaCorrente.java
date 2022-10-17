package modelo; 

public class ContaCorrente implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
    
    @Override
    public void saca(double valor) {
    	double valorASacar = valor + 0.2;
    	super.saca(valorASacar);
    }
    
    @Override
    public void deposita(double valor) {
    	super.saldo += valor;
    }

	@Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }

	public char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}
}
