package ExerciciosCurso;

import java.util.Scanner;

public class Exercicio6 {
	public static final double pi = 3.14159;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int opcao;
		System.out.println("Calculadora de área das formas geométricas");
		System.out.printf("Digite qual forma geométrica:%n[1]Triângulo retângulo;%n[2]Círculo;%n[3]Trapézio;%n[4]Quadrado;%n[5]Retângulo.%n");
		opcao = sc.nextInt();
		
		if (opcao == 1) {
				double baseTriangulo, alturaTriangulo, areaTriangulo;
				System.out.println("Qual o comprimento da base?");
				baseTriangulo = sc.nextDouble();
				System.out.println("Qual a altura?");
				alturaTriangulo = sc.nextDouble();
				areaTriangulo = (baseTriangulo * alturaTriangulo/2);
				System.out.printf("O valor da área de um triângulo retângulo de base %.2f e altura %.2f é de %.3f", baseTriangulo, alturaTriangulo, areaTriangulo);
		}
		else if (opcao == 2) { 
				double raio, areaCirculo;
				System.out.println("Qual o comprimento do raio?");
				raio = sc.nextDouble();
				areaCirculo = (Math.pow(raio, 2.0)*pi);
				System.out.printf("Um círculo de raio %.2f, considerando pi = %.5f é igual a %.3f", raio, pi, areaCirculo);
		}
		else if (opcao == 3) {
				double baseMenor, baseMaior, alturaTrapezio, areaTrapezio;
				System.out.println("Qual o valor da base menor?");
				baseMenor = sc.nextDouble();
				System.out.println("Qual o valor da base maior?");
				baseMaior = sc.nextDouble();
				System.out.println("Qual o valor da altura?");
				alturaTrapezio = sc.nextDouble();
				areaTrapezio = (((baseMenor + baseMaior)/2)*alturaTrapezio);
				System.out.printf("O trapézio de base menor %.2f, de base maior %.2f e de altura %.2f tem %.3f de área", baseMenor, baseMaior, alturaTrapezio, areaTrapezio);
		}
		else if (opcao == 4) {
				double ladoQuadrado, areaQuadrado;
				System.out.println("Qual é o valor do lado?");
				ladoQuadrado = sc.nextDouble();
				areaQuadrado = Math.pow(ladoQuadrado, 2.0);
				System.out.printf("O quadrado de lado %.2f tem a área de %.3f", ladoQuadrado, areaQuadrado);
		}
		else if (opcao == 5) {
				double baseRetangulo, alturaRetangulo, areaRetangulo;
				System.out.println("Qual o valor da base?");
				baseRetangulo = sc.nextDouble();
				System.out.println("Qual o valor da altura?");
				alturaRetangulo = sc.nextDouble();
				areaRetangulo = (baseRetangulo * alturaRetangulo);
				System.out.printf("O retangulo de base %.2f e altura %.2f tem área de %.3f", baseRetangulo, alturaRetangulo, areaRetangulo);
		}
		else {
			System.out.println("Valor incorreto, digite um número válido.");
		}	
		sc.close();

	}

}
