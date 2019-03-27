package util;

public class AtualizarUsuariosCommand implements Command {

	@Override
	public void execute() {
		
		AppTamagotchi.atualizarUsuario();
		
	}

}
