package br.com.thiago.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
		OutputStream fos = new FileOutputStream("poema2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("De tudo, ao meu amor serei atento");
		//bw.newLine();
		bw.newLine();
		bw.write("shdousahdsajdhsajkdhsajk jsahdjsahdj sajdhsaj");
		
		System.out.println();
		bw.close();
		
	}
}
