package br.com.thiago.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Unibank.
 * 
 * @author Thiago Silva
 * @version 0.1
 */
public class Cliente implements Serializable {

	private static final long serialVersionUID = 4L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNomeCpf() {
		return this.nome + ", " + this.cpf;
	}
	
	public String getNomeCpfProfissao() {
		return this.nome + ", " + this.cpf + ", " + this.profissao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
}
