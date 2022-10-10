package singleton;

class LogManager2Test {

	void deveSerInstanciaUnica() {
		LogManager2 instance1 = LogManager2.getInstance();
		
		LogManager2 instance2 = LogManager2.getInstance();
	}

}
