
public class ComandoCarro implements Comando {

	private Carro carro;
	
	ComandoCarro(Carro c){
		this.carro = c;
	}
	@Override
	public void fazer() {
		// TODO Auto-generated method stub
		this.carro.ligar();

	}

	@Override
	public void desfazer() {
		// TODO Auto-generated method stub
		this.carro.desligar();

	}

}
