package com.Bakarery.BakeryProject.AT;

public class Buffet extends Serviços {
	private String situacao;
	private String prato;
	private double preco;
	
	private final int CAFE = 1;
	private final int ALMOCO = 2;
	private final int JANTA = 3;
	
	public Buffet(Integer id, String tipoServ, String situacao, String prato, double preco) {
		super(id,tipoServ);
		this.situacao = situacao;
		this.prato = prato;
		this.preco = preco;
	}
	

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return super.toString()+" " + situacao + " " + prato + " " + preco;
	}

	
	
}
