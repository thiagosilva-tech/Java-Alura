//Gerente eh um Funcionario, Gerda herda da class Funcinario
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Editor de  Video");
		return 150;
	}
}
