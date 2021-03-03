package com.rogerioreis.model;

public class Funcionario {

	private String nome;

	private double valorPorHora;

	private int horas;

	public Funcionario() {

	}

	public Funcionario(String nome, double valorPorHora, int horas) {
		super();
		this.nome = nome;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	
	public double total () {
		return valorPorHora * horas;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		if(valorPorHora >=0) {
			
			this.valorPorHora = valorPorHora;
		}
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if(horas >=0) {
			
			this.horas = horas;
		}
	}

	@Override
	public String toString() {
		return "Funcionario [Nome=" + nome + ", \nValorPorHora=" + valorPorHora + ", \nHoras=" + horas + "]";
	}

}
