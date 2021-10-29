package br.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String ulrProduto;
	
	@NotBlank
	private String urlImagem;
	private String descricao;
	
	public String getNovoProduto() {
		return nomeProduto;
	}
	public void setNovoProduto(String novoProduto) {
		this.nomeProduto = novoProduto;
	}
	public String getUlrProduto() {
		return ulrProduto;
	}
	public void setUlrProduto(String ulrProduto) {
		this.ulrProduto = ulrProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(ulrProduto);
		return pedido;
	}
	
	

}
