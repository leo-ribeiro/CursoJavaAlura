package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo*;

public class TesteSaca {

	public static void main(String[] args) {
		modelo.ContaCorrente conta = new modelo.ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
		conta.saca(190.0);
		} catch(Exception ex) {
			System.out.println(conta.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
