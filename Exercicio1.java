package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.printf("Programa de soma de números%nDigite o primeiro valor:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2 = sc.nextInt();
		int soma = (numero1 + numero2);
		System.out.printf("A soma dos valores é %d", soma);

	
		sc.close();
	}

}
