package br.com.thiago.rh.service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste{
	
	BigDecimal valorImpostoDeRenda();
}
