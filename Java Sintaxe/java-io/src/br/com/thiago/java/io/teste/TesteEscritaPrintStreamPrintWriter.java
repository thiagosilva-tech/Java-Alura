package br.com.thiago.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter{
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
//		OutputStream fos = new FileOutputStream("poema2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		BufferedWriter bw = new BufferedWriter(new FileWriter("poema2.txt"));
		
//		PrintStream  ps = new PrintStream(new File("poema2.txt"));
		
		PrintWriter ps = new PrintWriter("poema2.txt", "UTF-8");
		
		ps.println("De tudo, ao meu amor serei atento");
		ps.println();
		ps.println();
		ps.println();
		ps.println("shdousahdsajdhsajkdhsajk jsahdjsahdj sajdhsaj");
	

		ps.close();
		
	}
}
