package aula05atividades_2semestre;

public class Objeto_Funcionario {

	public static void main(String[] args) {

		Jornada func1 = new Jornada(1, "João", "12345678987", 2134859, "Rua Tenório, número 123", 70.00, 9);
		func1.exibirFuncionario();
		func1.calculaSalario();

		System.out.println();

		Horista func2 = new Horista(2, "Paulo", "09876543212", 9087624, "Rua Barros, número 13", 80.00, 8);
		func2.exibirFuncionario();
		func2.calculaSalario();

		System.out.println();

		PessoaJuridica func3 = new PessoaJuridica(3, "Marcos", "98735461730", 91746392, "Rua Principal, número 105",
				10000.00, 1000.00);
		func3.exibirFuncionario();
		func3.calculaSalario();

	}

}
