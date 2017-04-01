package br.com.example.curso.lti.domain;

import java.io.Serializable;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6696727997088482762L;
	
	public Usuario() {
		
	}
	private int id;
	private String nome;
	private String cpf;
	
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
