package rafael.aula.dio.gof.singleton;
/**
 * Singleton "apressado"
 * @author Rafael-S-Alberto
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
