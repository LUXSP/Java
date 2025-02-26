package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio7 {
	public static final double valorPlano = 50.00;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorTotal, valorAdicional;
		int minutosUtilizados, minutosExcedentes;
		System.out.println("Quantos minutos foi utilizado para ligações?");
		minutosUtilizados = sc.nextInt();
		if (minutosUtilizados <= 100) {
			valorTotal = 50;
			System.out.printf("O valor a ser pago é %.2f. Como você não excedeu o limite, não haverá custos adicionais", valorTotal);
		}
		else {
			valorAdicional = (minutosUtilizados - 100)*2;
			valorTotal = (valorPlano + valorAdicional);
			minutosExcedentes = (minutosUtilizados - 100);
			System.out.printf("O valor a total a ser pago é de %.2f. Como você excedeu o limite de tempo em %d minutos, o valor excedente a ser pago é de R$ %.2f", valorTotal, minutosExcedentes, valorAdicional);
		}
		
		
		sc.close();
		
	}

}
