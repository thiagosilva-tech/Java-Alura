
public class TestaCondiciona2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("Valor de acompanhdo = " + acompanhado);
		// && = e || = ou
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}

	}
}