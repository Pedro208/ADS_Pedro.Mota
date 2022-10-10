package builder.carro;

class CarroBuilderTest {

	void deveContruirUmCarroPeloBuilder() {
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//Builder
		CarroBuilder carrobuilder = new CarroBuilder();
		carrobuilder.builderPortas(portas);
		carrobuilder.builderComputadorBordo(computadorSiemens);
		carrobuilder.builderMotor(motorVTEC);
		carrobuilder.buildersFreios(freioBosch);
		
		//Teste o carro contruido
		Carro carroContruido = carrobuilder.getCarro();
		
		
	}
}
