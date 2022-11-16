package br.com.thiago.loja.teste;

import java.math.BigDecimal;

import br.com.thiago.loja.http.JavaHttpCliente;
import br.com.thiago.loja.orcamento.Orcamento;
import br.com.thiago.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		registro.registrar(orcamento);

	}

}
