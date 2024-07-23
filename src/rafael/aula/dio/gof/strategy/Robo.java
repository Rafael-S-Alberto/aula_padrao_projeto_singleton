package rafael.aula.dio.gof.strategy;

public class Robo {

	public Comportamento comportamento;
	
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
	
}
