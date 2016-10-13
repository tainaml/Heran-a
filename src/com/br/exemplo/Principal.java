package com.br.exemplo;

import com.br.exemplo.domain.Funcionario;
import com.br.exemplo.domain.Gerente;

public class Principal {

	public static void main(String[] args) {
		Funcionario ff1 = new Funcionario(11, "Funcionario 11");
		
		Funcionario f1 = new Gerente();
		//acessa somente os atributos do funcionario
		f1.setId(1);
		f1.setNome("Gerente");
		
		((Gerente) f1).getEquipe().add(new Funcionario(2, "Funcionario 2"));
		((Gerente) f1).getEquipe().add(new Funcionario(3, "Funcionario 3"));
		((Gerente) f1).getEquipe().add(new Funcionario(4, "Funcionario 4"));
		((Gerente) f1).getEquipe().add(ff1);
		
		//imprimir infos do gerente
		print(f1);
		
		//imprimir infos de um usuario espcifico
		print(ff1);
		
		
		
		//criar um novo gerente
		Gerente gerente = new Gerente();
		gerente.setId(5);
		gerente.setNome("Gerente 5");
		
		print(gerente);
	}
	
	//este metodo vai imprimir as infos de qualquer classe que extenda a classe funciona.
	//no caso, o gerente e o proprio funcionario podem imprimir neste metodo.
	public static void print(Funcionario f){
		System.out.println(f.getId() + " - " + f.getNome());
	}
}
