package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peca1, numeroPecas1, peca2, numeroPecas2;
		double valorPeca1, valorPeca2, total;
		System.out.printf("Calculadora de itens%nDigite o código da primeira peça:");
		peca1 = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças que será comprada:");
		numeroPecas1 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da primeira peça:");
		valorPeca1 = sc.nextDouble();
		
		
		System.out.printf("Digite o código da segunda peça:");
		peca2 = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças que será comprada:");
		numeroPecas2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da segunda peça:");
		valorPeca2 = sc.nextDouble();
		
		total = (valorPeca1 * numeroPecas1 + valorPeca2 * numeroPecas2);
		System.out.printf("Quantidade de peças do código %d: %d%nQuantidade de peças do código %d: %d%n%nO total a ser pago é de U$%.2f", peca1, numeroPecas1, peca2, numeroPecas2, total);
		
		
		sc.close();
	}

}
