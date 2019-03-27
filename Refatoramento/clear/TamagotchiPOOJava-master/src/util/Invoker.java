package util;
import java.util.HashMap;
import java.util.Map;

public class Invoker {

	public static Map<String, Command> comandos = new HashMap<String, Command>();
	
	static {
		comandos.put("1", new CriarUsuarioCommand());
		comandos.put("2", new mostrarUsuariosCommand());
		comandos.put("3", new AtualizarUsuariosCommand());
		comandos.put("4", new RemoverUsuarioCommand());
	}
	
	public static void invoke(String command) {
		comandos.get(command).execute();
	}
	
}
