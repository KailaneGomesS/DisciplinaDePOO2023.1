package br.edu.principal;

import java.util.Scanner;

public class q_20 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 double base = 0.0;
		 double angulo = 0.0;
		 System.out.println("Digite a base: ");
		 base = sc.nextDouble();
		 System.out.println("Digte o ângulo formado pela base e a escada: ");
		 angulo = sc.nextDouble();
		 double rad = angulo * Math.PI/180;
		 double hip = base/Math.cos(rad);
		 System.out.println(hip);
		 
		 
		 
	}

}
