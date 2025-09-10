package aula05atividades_2semestre;

public class Objeto_computador {

	public static void main(String[] args) {

		Gamer comp_gamer = new Gamer();
		Home comp_home = new Home();
		
		comp_gamer.ligar();
		comp_gamer.carregandoSistema();
		comp_gamer.reiniciar();
		comp_gamer.desligar();
		System.out.println();
		comp_home.ligar();
		comp_home.carregandoSistema();
		comp_home.desligar();
		comp_home.desligar();
	}

}
