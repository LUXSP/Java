package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de salário referente às horas trabalhadas");
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salarioTotal;
		System.out.println("Digite o seu código de funcionário, anexado junto ao seu documento de admissão:");
		numeroFuncionario = sc.nextInt();
		System.out.println("Digite quantas horas você trabalhou este mês:");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite quanto você recebe por hora trabalhada:");
		valorHora = sc.nextDouble();
		salarioTotal = (horasTrabalhadas * valorHora);
		System.out.printf("Funcionário: %d%nHoras trabalhadas no mês: %d%nValor pago por hora: %.2f%nSalário total: U$%.2f", numeroFuncionario, horasTrabalhadas, valorHora, salarioTotal);
		
		
		
		
		
		
		
		sc.close();
	}

}
