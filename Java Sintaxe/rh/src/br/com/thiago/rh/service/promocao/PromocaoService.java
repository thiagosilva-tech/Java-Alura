package br.com.thiago.rh.service.promocao;

import br.com.thiago.rh.ValidacaoException;
import br.com.thiago.rh.model.Cargo;
import br.com.thiago.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == funcionario.getCargo()) {
			throw new ValidacaoException("Gerente nao podem ser promovidos");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario nao bateu a meta");
		}
		
	}
}
