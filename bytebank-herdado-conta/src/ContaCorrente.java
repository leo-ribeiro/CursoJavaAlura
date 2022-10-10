
public class ContaCorrente implements Tributavel{

    public ContaCorrente(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
}
