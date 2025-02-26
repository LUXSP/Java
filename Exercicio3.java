package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		double calculo;
		System.out.println("Digite o primeiro valor:");
		A = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		B = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		C = sc.nextInt();
		System.out.println("Digite o último valor:");
		D = sc.nextInt();
		calculo = (A*B-C*D);
		System.out.printf("A diferença entre o produto de %d e %d pelo produto de %d e %d é igual a %f", A, B, C, D, calculo);
		
		
		
		
		sc.close();
		
	}

}
