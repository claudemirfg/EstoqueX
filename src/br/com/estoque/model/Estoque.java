package br.com.estoque.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Estoque {

	@GeneratedValue
	@Id
	private Long codigoEstoque;
	
	@Temporal(TemporalType.DATE)
	private Date dataEstoque;
	
	@Column(nullable = false)
	private String produtoEstoque;
	
	@Column(nullable = false)
	private int quantidadeEstoque;
	
	@Column(nullable = false)
	private Double pesoEstoque;
	
	private Double mediaEstoque;
	
	private String observacaoEstoque;

	public Long getCodigoEstoque() {
		return codigoEstoque;
	}

	public void setCodigoEstoque(Long codigoEstoque) {
		this.codigoEstoque = codigoEstoque;
	}

	public Date getDataEstoque() {
		return dataEstoque;
	}

	public void setDataEstoque(Date dataEstoque) {
		this.dataEstoque = dataEstoque;
	}

	public String getProdutoEstoque() {
		return produtoEstoque;
	}

	public void setProdutoEstoque(String produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Double getPesoEstoque() {
		return pesoEstoque;
	}

	public void setPesoEstoque(Double pesoEstoque) {
		this.pesoEstoque = pesoEstoque;
	}

	public Double getMediaEstoque() {
		return mediaEstoque;
	}

	public void setMediaEstoque(Double mediaEstoque) {
		this.mediaEstoque = mediaEstoque;
	}

	public String getObservacaoEstoque() {
		return observacaoEstoque;
	}

	public void setObservacaoEstoque(String observacaoEstoque) {
		this.observacaoEstoque = observacaoEstoque;
	}
	
}
