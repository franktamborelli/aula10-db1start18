package br.com.db1.exercicio08;

import java.util.List;

public class Banco {
	private Integer numero;

	private Integer digitoVerificador;
	
	private List<Conta> contas;

	public Boolean isPublico() {
		return true;
	}
}
