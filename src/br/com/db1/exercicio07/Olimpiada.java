package br.com.db1.exercicio07;

public class Olimpiada {
	private Integer ano;
	private Modalidade modalidade;
	private Pessoa pessoa;
	private Sede sede;
	
	public Olimpiada(Modalidade modalidade, Pessoa pessoa, Sede sede) {
		this.modalidade = modalidade;
		this.pessoa = pessoa;
		this.sede = sede;
		
	}
}
