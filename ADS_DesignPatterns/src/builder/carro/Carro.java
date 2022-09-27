package builder.carro;

public class Carro {
	
	private Porta [] portas;
	private Motor motor;
	private ComputadorBordo computadorBordo;
	private FreioABS freiosAbs;
	
	
	
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public ComputadorBordo getComputadorBordo() {
		return computadorBordo;
	}
	public void setComputadorBordo(ComputadorBordo computadorBordo) {
		this.computadorBordo = computadorBordo;
	}
	
	public FreioABS getFreiosAbs() {
		return freiosAbs;
	}
	public void setFreiosAbs(FreioABS freiosAbs) {
		this.freiosAbs = freiosAbs;
	}	
}
