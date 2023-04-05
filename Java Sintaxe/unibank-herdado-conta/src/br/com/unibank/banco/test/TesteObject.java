package br.com.unibank.banco.test;

import br.com.unibank.banco.modelo.Cliente;
import br.com.unibank.banco.modelo.Conta;
import br.com.unibank.banco.modelo.ContaCorrente;
import br.com.unibank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(123, 333);
		Object cp = new ContaPoupanca(321, 222);	
		Object cliente = new Cliente();
		
		
		System.out.println(cc);
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
