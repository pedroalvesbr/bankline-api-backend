package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity				//entidade
@Table(name="tab_correntista") //os registros da classe serão salvas na tabela db
public class Correntista {
	@Id	//chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //chave primaria autoincremental
	private Integer id;
	
	@Column(length = 20)
	private String cpf;
	
	@Column(length= 60)
	private String nome;
	
	
	private Conta conta;
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Integer getId() {
		return id;
	} 
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
