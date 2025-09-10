package aula05atividades_2semestre;
import java.util.Scanner;
public class Carro implements Interface_Carros {

	Scanner ler = new Scanner(System.in);
	String marca = ler.nextLine();
	public void ligar() {
		System.out.println("A " + marca + " ligou");
	}

	public void desligar() {
		System.out.println("A " + marca + " desligou");
	}

	public void manobrar() {
		System.out.println("A " + marca + " manobrou");
	}

	public void engatar() {
		System.out.println("A " + marca + " engatou a marcha");
	}

	public void acelerar() {
		System.out.println("A " + marca + " acelerou");
	}

	public void frear() {
		System.out.println("A " + marca +" freiou");
	}

}
