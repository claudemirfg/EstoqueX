package br.com.estoque.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Marchant {
	
	@GeneratedValue
	@Id
	private Long codigo;
	
	@Column(nullable = false)
	private String nomeMarchant;
	
	private String enderecoMarchant;
	
	private String cepMarchant;
	
	private String cidadeMarchant;
	
	private String estadoMarchant;
	
	private String celularMarchant;
	
	private String telFixoMarchant;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomeMarchant() {
		return nomeMarchant;
	}

	public void setNomeMarchant(String nomeMarchant) {
		this.nomeMarchant = nomeMarchant;
	}

	public String getEnderecoMarchant() {
		return enderecoMarchant;
	}

	public void setEnderecoMarchant(String enderecoMarchant) {
		this.enderecoMarchant = enderecoMarchant;
	}

	public String getCepMarchant() {
		return cepMarchant;
	}

	public void setCepMarchant(String cepMarchant) {
		this.cepMarchant = cepMarchant;
	}

	public String getCidadeMarchant() {
		return cidadeMarchant;
	}

	public void setCidadeMarchant(String cidadeMarchant) {
		this.cidadeMarchant = cidadeMarchant;
	}

	public String getEstadoMarchant() {
		return estadoMarchant;
	}

	public void setEstadoMarchant(String estadoMarchant) {
		this.estadoMarchant = estadoMarchant;
	}

	public String getCelularMarchant() {
		return celularMarchant;
	}

	public void setCelularMarchant(String celularMarchant) {
		this.celularMarchant = celularMarchant;
	}

	public String getTelFixoMarchant() {
		return telFixoMarchant;
	}

	public void setTelFixoMarchant(String telFixoMarchant) {
		this.telFixoMarchant = telFixoMarchant;
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
		Marchant other = (Marchant) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
