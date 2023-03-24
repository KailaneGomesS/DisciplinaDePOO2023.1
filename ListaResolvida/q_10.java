package testets;

import java.util.Scanner;

public class q_10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double lado = 0.0;
		 System.out.println("Digite o comprimento do lado do quadrado: ");
		 lado = sc.nextInt();
		 double area = lado * lado;
		 System.out.println("A área do quadrado é: " + area);

	}

}
