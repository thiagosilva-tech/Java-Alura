// quem assina uma interface precisa definir os metodos

public class Cliente implements Autenticavel {

	private AutenticacaoDoSistema autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoDoSistema();
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
