package com.rogerioreis.model;

import java.util.Scanner;

public class ProgramRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int numFunc;
		Funcionario func;
		func = new Funcionario();
		double totalGeral = 0;
		System.out.print("Informe o n�mero de funcion�rios: ");
		numFunc = scan.nextInt();

		for (int i = 0; i < numFunc; i++) {
			System.out.printf("Informe o nome do %d� funcion�rio: ", i + 1);
			func.setNome(scan.next());
			System.out.printf("Informe as horas do funcion�rio " + func.getNome() + ": ");
			func.setHoras(scan.nextInt());
			System.out.printf("Informe o valor da hora do funcion�rio " + func.getNome() + ": ");
			func.setValorPorHora(scan.nextDouble());
			System.out.printf("Total do %d� funcionario: %.2f\n\n", i + 1, +func.total());

			totalGeral += func.total();
		}

		System.out.println("Total dos funcion�rios: " + totalGeral);
	}

}
