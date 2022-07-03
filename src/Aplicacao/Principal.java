package Aplicacao;

import java.util.Scanner;

import Entidade.Funcionario;

public class Principal {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.print("Quantos funcionarios seram registrados ?");
		int employee = input.nextInt();
		Funcionario funcio =  new Funcionario();
		funcio.registrarFuncionario(employee);
		funcio.incrementarSalario();
		funcio.listaFuncionario();
		
	}

}
