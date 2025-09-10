package aula05atividades_2semestre;

import java.util.Scanner;

public class Objeto_Calculando {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double num1 = ler.nextInt();

		System.out.println("Informe o segundo número: ");
		double num2 = ler.nextInt();

		ler.close();

		Calculando calculando = new Calculando(num1, num2);

		calculando.somar();
		calculando.sub();
		calculando.mult();
		calculando.div();
		calculando.exp();
	}

}