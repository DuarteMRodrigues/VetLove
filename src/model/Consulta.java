package model;

import java.util.Date;

public class Consulta {
	private int id;
	private String descricao;
	private Date dataConsulta;

	public Consulta(int id, String descricao, Date dataConsulta) {
		this.id = id;
		this.descricao = descricao;
		this.dataConsulta = dataConsulta;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
}
