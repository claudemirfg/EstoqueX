package br.com.estoque.model;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class VencimentoVenda {

	private Date dataVencimento;
	private Double valor;
	
	public VencimentoVenda(){
	}
	
	public VencimentoVenda(Date dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
