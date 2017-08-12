package com.franciscocalaca.exemplo.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String itemA;
	
	private String itemB;
	
	private String itemC;
	
	private String itemD;
	
	private String itemE;
	
	private String resposta;

	public String getItemA() {
		return itemA;
	}

	public void setItemA(String itemA) {
		this.itemA = itemA;
	}

	public String getItemB() {
		return itemB;
	}

	public void setItemB(String itemB) {
		this.itemB = itemB;
	}

	public String getItemC() {
		return itemC;
	}

	public void setItemC(String itemC) {
		this.itemC = itemC;
	}

	public String getItemD() {
		return itemD;
	}

	public void setItemD(String itemD) {
		this.itemD = itemD;
	}

	public String getItemE() {
		return itemE;
	}

	public void setItemE(String itemE) {
		this.itemE = itemE;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Integer getId() {
		return id;
	}
	
	

}
