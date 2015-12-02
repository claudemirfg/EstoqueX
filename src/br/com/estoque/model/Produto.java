package br.com.estoque.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Produto {

	@GeneratedValue
	@Id
	@Column(name = "codigo_produto")
	private Long codigo;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private Enum<TipoAnimal> tipo;

	private Double quebraFrio;

	private Double porcentagemMacho;

	private Double porcentagemFemea;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Enum<TipoAnimal> getTipo() {
		return tipo;
	}

	public void setTipo(Enum<TipoAnimal> tipo) {
		this.tipo = tipo;
	}

	public Double getQuebraFrio() {
		return quebraFrio;
	}

	public void setQuebraFrio(Double quebraFrio) {
		this.quebraFrio = quebraFrio;
	}

	public Double getPorcentagemMacho() {
		return porcentagemMacho;
	}

	public void setPorcentagemMacho(Double porcentagemMacho) {
		this.porcentagemMacho = porcentagemMacho;
	}

	public Double getPorcentagemFemea() {
		return porcentagemFemea;
	}

	public void setPorcentagemFemea(Double porcentagemFemea) {
		this.porcentagemFemea = porcentagemFemea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


}
