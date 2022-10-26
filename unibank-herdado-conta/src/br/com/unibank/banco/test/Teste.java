package br.com.unibank.banco.test;

import br.com.unibank.banco.modelo.Cliente;
import br.com.unibank.banco.modelo.Conta;
import br.com.unibank.banco.modelo.ContaCorrente;
import br.com.unibank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);	
		Object cliente = new Cliente();
		
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
//		println(cliente);
//		println(cc);
//		println(cp);
	}
	
	static void println() {	
	}
	
	static void println(int a) {	
	}
	
	static void println(boolean valor) {	
	}
	
	static void println(Object x) {	
	}
}
