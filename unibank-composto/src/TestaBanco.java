
public class TestaBanco {
	public static void main(String[] args) {
		Cliente thiago = new Cliente();
		thiago.nome = "Thiago Silva";
		thiago.cpf = "042.244.140-66";
		thiago.profissao = "programador";

		// associa o cliente Thiago a conta contaDoThiago
		Conta contaDoThiago = new Conta();
		contaDoThiago.deposita(100);

		contaDoThiago.titular = thiago;
		System.out.println(contaDoThiago.titular.nome);
		System.out.println(contaDoThiago.titular);
		System.out.println(thiago);
	}
}
