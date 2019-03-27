package util;
import dao.UsuarioDAO;
import util.AppTamagotchi;

public class CriarUsuarioCommand implements Command{

	@Override
	public void execute() {
		AppTamagotchi.criarUsuario();		
	}

}
