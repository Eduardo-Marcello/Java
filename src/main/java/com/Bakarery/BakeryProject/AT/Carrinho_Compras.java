package com.Bakarery.BakeryProject.AT;

public class Carrinho_Compras extends Serviços {
	private int codigoProduto;
	private String nomeProduto;
	private String classificacao;
	private double preco;
	
	public Carrinho_Compras(Integer id, String tipoServ, int codigoProduto, String nomeProduto, String classificacao, double preco) {
		super(id,tipoServ);
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.classificacao = classificacao;
		this.preco = preco;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return super.toString()+ " "+ codigoProduto +" " + nomeProduto + " "
				+ classificacao + " " + preco;
	}
	
	
	
}
