package builder.carro;

public class CarroBuilder {
	
	private Carro carro;
	
	public CarroBuilder() {
		carro = new Carro();
	}
	
	public void builderMotor(Motor m) {
		carro.setMotor(m);
	}
	public void builderComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);;
	}
	public void builderPortas(Porta[] portas) {
		carro.setPortas(portas);;
	}
	public void buildersFreios(FreioABS freio) {
		carro.setFreiosAbs(freio);
	}

	public Carro getCarro() {
		return carro;
	}
}
