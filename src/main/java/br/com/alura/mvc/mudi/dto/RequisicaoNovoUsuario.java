package br.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoUsuario {
	
	@NotBlank
	private String nomeCompleto;
	
	@NotBlank
	private String cpf;
	
	private String rg;
	
	@NotBlank
	private String dataNascimento;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}
