package br.com.db1.exercicio08;

public class Conta {
	private Integer numero;

	private Integer digitoVerificador;

	private Agencia agencia;

	private Pessoa pessoa;

	public Conta(Pessoa pessoa, Agencia agencia) {
		this.pessoa = pessoa;
		this.agencia = agencia;

	}
}
