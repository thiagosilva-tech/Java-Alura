package br.com.unibank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.unibank.banco.modelo.Cliente;
import br.com.unibank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setProfissao("Dev");
		cliente.setCpf("04224414066");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
				
	}

}
