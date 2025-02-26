package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio2 {
	public static final double pi = 3.14159;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Calculadora de área de círculo%nDigite o valor do raio:");
		double raio = sc.nextDouble();
		double areaCirculo = (pi * (Math.pow(raio, 2.0)));
		System.out.printf("O valor da área é %.4f", areaCirculo);
		
		
		sc.close();
		
	}

}
