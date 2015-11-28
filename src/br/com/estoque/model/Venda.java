package br.com.estoque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Venda {

	@GeneratedValue
	@Id
	private Long codigoVenda;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataVenda;
	
	@Column(nullable = false)
	private String marchantVenda;
	
	@Column(nullable = false)
	private String destinatarioVenda;
	
	@Column(nullable = false)
	private String produtoVenda;
	
	@Column(nullable = false)
	private int quantidadeVenda;
	
	@Column(nullable = false)
	private Double pesoVenda;
	
	@Column(nullable = false)
	private Double valorUnitarioVenda;

	@Column(nullable = false)
	private Double valorTotalVenda;
	
	@ElementCollection
	@CollectionTable(name = "venc_venda", joinColumns = @JoinColumn(name = "codigo_venda"))
	private List<VencimentoVenda> vencimentovenda = new ArrayList<>();
	
	private Double descontoVenda;

	private Double mediaVenda;
	
	private String observacaoVenda;

	public Long getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(Long codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getMarchantVenda() {
		return marchantVenda;
	}

	public void setMarchantVenda(String marchantVenda) {
		this.marchantVenda = marchantVenda;
	}

	public String getDestinatarioVenda() {
		return destinatarioVenda;
	}

	public void setDestinatarioVenda(String destinatarioVenda) {
		this.destinatarioVenda = destinatarioVenda;
	}

	public String getProdutoVenda() {
		return produtoVenda;
	}

	public void setProdutoVenda(String produtoVenda) {
		this.produtoVenda = produtoVenda;
	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}

	public Double getPesoVenda() {
		return pesoVenda;
	}

	public void setPesoVenda(Double pesoVenda) {
		this.pesoVenda = pesoVenda;
	}

	public Double getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(Double valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

	public Double getValorTotalVenda() {
		return valorTotalVenda;
	}

	public void setValorTotalVenda(Double valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}

	public List<VencimentoVenda> getVencimentovenda() {
		return vencimentovenda;
	}

	public void setVencimentovenda(List<VencimentoVenda> vencimentovenda) {
		this.vencimentovenda = vencimentovenda;
	}

	public Double getDescontoVenda() {
		return descontoVenda;
	}

	public void setDescontoVenda(Double descontoVenda) {
		this.descontoVenda = descontoVenda;
	}

	public Double getMediaVenda() {
		return mediaVenda;
	}

	public void setMediaVenda(Double mediaVenda) {
		this.mediaVenda = mediaVenda;
	}

	public String getObservacaoVenda() {
		return observacaoVenda;
	}

	public void setObservacaoVenda(String observacaoVenda) {
		this.observacaoVenda = observacaoVenda;
	}
	
}
