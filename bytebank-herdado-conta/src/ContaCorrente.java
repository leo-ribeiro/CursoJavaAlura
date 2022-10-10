
public class ContaCorrente implements Tributavel{

    @Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
}
