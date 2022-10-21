
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente thiago = new Cliente();
		//conta.titular = thiago;
		thiago.setNome("Thiago Silva");
		
		conta.setTitular(thiago);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(thiago);
		System.out.println(conta.getTitular());
	}
}
