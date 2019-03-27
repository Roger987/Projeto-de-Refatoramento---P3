package util;
import dao.UsuarioDAO;
import util.AppTamagotchi;

public class mostrarUsuariosCommand implements Command{

	@Override
	public void execute() {
		
		AppTamagotchi.mostrarUsuarios();
		
	}
	

}
