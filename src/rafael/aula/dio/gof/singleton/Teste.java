package rafael.aula.dio.gof.singleton;

public class Teste {
	public static void main(String[] args) {
		SingletonLazy nomeLazy = SingletonLazy.getInstancia();
		System.out.println(nomeLazy);
		nomeLazy = SingletonLazy.getInstancia();
		System.out.println(nomeLazy);
		
		SingletonEager nomeEager = SingletonEager.getInstancia();
		System.out.println(nomeEager);
		nomeEager = SingletonEager.getInstancia();
		System.out.println(nomeEager);

		SingletonLazyHolder nomeLazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(nomeLazyHolder);
		nomeLazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(nomeLazyHolder);
	}
}
