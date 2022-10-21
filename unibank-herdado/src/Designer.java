//Gerente eh um Funcionario, Gerente herda da class Funcinario
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Designer");
		return 200;
	}
}
