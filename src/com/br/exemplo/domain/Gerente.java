package com.br.exemplo.domain;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	
	private List<Funcionario> equipe;

	
	public Gerente() {
		equipe = new ArrayList<Funcionario>();
	}
	
	
	public List<Funcionario> getEquipe() {
		return equipe;
	}

	
	public void setEquipe(List<Funcionario> equipe) {
		this.equipe = equipe;
	}

}
