package com.Bakarery.BakeryProject.AT;

public abstract class Serviços {
	private Integer id;
	
	private String tipoServ;
	private final int CARRINHO = 1;
	private final int BUFFET = 2;

	public Serviços(Integer id, String tipoServ) {
		this.id = id;
		this.tipoServ = tipoServ;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTipoServ() {
		return tipoServ;
	}
	
	public void setTipoServ(String tipoServ) {
		this.tipoServ = tipoServ;
	}
	
	public int getCARRINHO() {
		return CARRINHO;
	}
	
	public int getBUFFET() {
		return BUFFET;
	}
	
	@Override
	public String toString() {
		return tipoServ + " "+ CARRINHO + " " + BUFFET;
	}
	
	
	
}
