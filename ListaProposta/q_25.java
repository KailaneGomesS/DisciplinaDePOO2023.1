package testets;

import java.util.Scanner;

public class q_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int hora = 0;
		 int minuto = 0;
		 System.out.println("Digite as horas: ");
		 hora = sc.nextInt();
		 System.out.println("Digite os minutos: ");
		 minuto = sc.nextInt();
		 int h2M = hora * 60;
		 int somaM = h2M + minuto;
		 int m2Seg =  somaM *60;
		 System.out.println("Horas para minutos: " + h2M + "\nTotal de minutos (soma): " + somaM + "\nTotal de minutos em segundos: " + m2Seg);

	}

}
