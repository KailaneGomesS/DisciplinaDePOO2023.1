package br.edu.principal;

import java.util.Scanner;

public class q_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		System.out.println ("Digite o primeiro número da sua divisão: ");
		num1 = sc.nextInt();
		System.out.println ("Digite o segundo número (diferente de 0) da sua divisão: ");
		num2 = sc.nextInt();
		double div = num1/num2;
		System.out.println("O resultado da diviisão é: " + div);

	}

}
