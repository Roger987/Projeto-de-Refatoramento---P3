package util;

public class RemoverUsuarioCommand implements Command{

	@Override
	public void execute() {
		
		AppTamagotchi.removerUsuario();
		
	}

}
