package rafael.aula.dio.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * 
 * @author Rafael-S-Alberto
 */
public class SingletonLazyHolder {

	private static class instanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return instanceHolder.instancia;
	}
}
