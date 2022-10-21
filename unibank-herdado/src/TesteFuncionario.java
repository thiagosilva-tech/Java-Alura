
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente thiago = new Gerente();
		thiago.setNome("Thiago Silva");
		thiago.setCpf("04224414066");
		thiago.setSalario(2600.00);

		System.out.println(thiago.getNome());
		System.out.println(thiago.getBonificacao());

	}
}
