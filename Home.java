package aula05atividades_2semestre;

public class Home implements Interface_Computador{

	public void ligar() {
		System.out.println("O computador de casa ligou");
	}

	public void reiniciar() {
		System.out.println("O computador de casa reiniciou");
	}

	public void desligar() {
		System.out.println("O computador de casa desligou");
	}

	public void carregandoSistema() {
		System.out.println("O sistema do computador de casa está carregando");
	}
}