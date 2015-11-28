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

public class Abate {

	@GeneratedValue
	@Id
	@Column(name = "codigo_abate")
	private Long codigoAbate;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataAbate;

	@Column(nullable = false)
	private String produtoAbate;

	@Column(nullable = false)
	private String marchantAbate;
	
	private String camaraFriaAbate;

	@Column(nullable = false)
	private int quantidadeAbate;

	@Column(nullable = false)
	private Double pesoInicialAbate;

	@Column(nullable = false)
	private Double valorUnitarioAbate;

	@Column(nullable = false)
	private Double valorTotalAbate;

	@ElementCollection
	@CollectionTable(name = "venc_abate", joinColumns = @JoinColumn(name = "codigo_abate"))
	private List<VencimentoAbate> vencimentoAbate = new ArrayList<>();

	private Double mediaAbate;

	private Double percentualAbate;

	private Double pesoFinalAbate;

	private Double descontoAbate;

	private String observacaoAbate;

	public Long getCodigoAbate() {
		return codigoAbate;
	}

	public void setCodigoAbate(Long codigoAbate) {
		this.codigoAbate = codigoAbate;
	}

	public Date getDataAbate() {
		return dataAbate;
	}

	public void setDataAbate(Date dataAbate) {
		this.dataAbate = dataAbate;
	}

	public String getProdutoAbate() {
		return produtoAbate;
	}

	public void setProdutoAbate(String produtoAbate) {
		this.produtoAbate = produtoAbate;
	}

	public String getMarchantAbate() {
		return marchantAbate;
	}

	public void setMarchantAbate(String marchantAbate) {
		this.marchantAbate = marchantAbate;
	}

	public int getQuantidadeAbate() {
		return quantidadeAbate;
	}

	public void setQuantidadeAbate(int quantidadeAbate) {
		this.quantidadeAbate = quantidadeAbate;
	}

	public Double getPesoInicialAbate() {
		return pesoInicialAbate;
	}

	public void setPesoInicialAbate(Double pesoInicialAbate) {
		this.pesoInicialAbate = pesoInicialAbate;
	}

	public Double getValorUnitarioAbate() {
		return valorUnitarioAbate;
	}

	public void setValorUnitarioAbate(Double valorUnitarioAbate) {
		this.valorUnitarioAbate = valorUnitarioAbate;
	}

	public Double getValorTotalAbate() {
		return valorTotalAbate;
	}

	public void setValorTotalAbate(Double valorTotalAbate) {
		this.valorTotalAbate = valorTotalAbate;
	}

	public List<VencimentoAbate> getVencimentoAbate() {
		return vencimentoAbate;
	}

	public void setVencimentoAbate(List<VencimentoAbate> vencimentoAbate) {
		this.vencimentoAbate = vencimentoAbate;
	}

	public Double getMediaAbate() {
		return mediaAbate;
	}

	public void setMediaAbate(Double mediaAbate) {
		this.mediaAbate = mediaAbate;
	}

	public Double getPercentualAbate() {
		return percentualAbate;
	}

	public void setPercentualAbate(Double percentualAbate) {
		this.percentualAbate = percentualAbate;
	}

	public Double getPesoFinalAbate() {
		return pesoFinalAbate;
	}

	public void setPesoFinalAbate(Double pesoFinalAbate) {
		this.pesoFinalAbate = pesoFinalAbate;
	}

	public Double getDescontoAbate() {
		return descontoAbate;
	}

	public void setDescontoAbate(Double descontoAbate) {
		this.descontoAbate = descontoAbate;
	}

	public String getObservacaoAbate() {
		return observacaoAbate;
	}

	public void setObservacaoAbate(String observacaoAbate) {
		this.observacaoAbate = observacaoAbate;
	}

	public String getCamaraFriaAbate() {
		return camaraFriaAbate;
	}

	public void setCamaraFriaAbate(String camaraFriaAbate) {
		this.camaraFriaAbate = camaraFriaAbate;
	}
	
}
