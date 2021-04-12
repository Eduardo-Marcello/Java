package com.Bakarery.BakeryProject.AT;

public class Funcionário {
	private Integer id;
	
	private String nome;
	private String cpf;
	private String cargo;
	private double salario;
	
	final int GERENTE = 1;
	final int ATENDENTE = 2;
	
	public Funcionário() {
		
	}
	
	public Funcionário(Integer id, String nome, String cpf, String cargo, double salario) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
