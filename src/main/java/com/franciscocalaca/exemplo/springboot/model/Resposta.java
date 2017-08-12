package com.franciscocalaca.exemplo.springboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resposta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Date data;
	
	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Questao questao;
	
	private String respondido;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public String getRespondido() {
		return respondido;
	}

	public void setRespondido(String respondido) {
		this.respondido = respondido;
	}

	public Integer getId() {
		return id;
	}
	
}
