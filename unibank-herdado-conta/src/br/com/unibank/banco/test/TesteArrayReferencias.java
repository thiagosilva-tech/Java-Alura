package br.com.unibank.banco.test;

import br.com.unibank.banco.modelo.Cliente;
import br.com.unibank.banco.modelo.Conta;
import br.com.unibank.banco.modelo.ContaCorrente;
import br.com.unibank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(22, 22);
		referencias[1] = cp2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
//		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		System.out.println(cp2.getNumero());
		System.out.println(ref.getNumero());
	}

}
