
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoDoSistema autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoDoSistema();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
