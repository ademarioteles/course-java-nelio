package Entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
	
	private ArrayList<Integer> Id = new ArrayList<>();
	private ArrayList<String> Nome = new ArrayList<>();
	private ArrayList<Double> Salario = new ArrayList<>();
	
	public ArrayList<Integer> getId() {
		return Id;
	}
	public void setId(ArrayList<Integer> id) {
		Id = id;
	}
	public ArrayList<String> getNome() {
		return Nome;
	}
	public void setNome(ArrayList<String> nome) {
		Nome = nome;
	}
	public ArrayList<Double> getSalario() {
		return Salario;
	}
	public void setSalario(ArrayList<Double> salario) {
		Salario = salario;
	}

	
	public void registrarFuncionario(int numeroFuncarios) {
		
		Scanner input = new Scanner(System.in);
		
		for(int x = 0; x < numeroFuncarios;x++) {
			
		System.out.printf("Funcionario #%d:\n",x + 1);
		
		System.out.printf("Id:");
		int Ids = input.nextInt();
		Integer i = new Integer(Ids);
		Id.add(x,i);	
		System.out.printf("Nome:");
		Nome.add(input.next());
		System.out.printf("Salario:");
		double salario = input.nextDouble();
		Salario.add(salario);
		System.out.println("");
		}
		
	
		
	}
	public void incrementarSalario() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Qual o Id(indentificador) do funcionario que gostaria de incrementar o salario ?\r");
		int resultado = 0;
		double porcentagem = 0;
		int pesquisarId = entrada.nextInt();
		for(int x = 0; x < Id.size(); x++) {
			
			if(Id.get(x) == pesquisarId ) {
				resultado = 1;
				System.out.printf("Aumentar salario em quantos porcento ?\r");
				porcentagem = entrada.nextDouble();
				Salario.add(x,Salario.get(x) + (Salario.get(x) * ( porcentagem / 100 )));
				break;
			}else {
				resultado = 0;
			}
		}
		if(resultado == 0) {
			System.out.println("Nenhum funcionario encontrado com Id:" + pesquisarId);
		}
		
		
	}
	
	public void listaFuncionario() {
		System.out.println("Lista de Funcionarios:");
		
		for(int x = 0; Id.size()> x;x++) {
			System.out.println(Id.get(x) + ", " + Nome.get(x) + ", " + Salario.get(x) );
			
		}
		if(Id.size() == 0) {
			
			System.out.println("Nenhum Funcionario encontrado!");
		}
	}


}
