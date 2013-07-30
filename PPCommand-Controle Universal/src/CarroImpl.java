
public class CarroImpl implements Carro {

	private Status status;
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.status = Status.LIGADO;
		System.out.println("Carro "+ this.status);

	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.status = Status.DESLIGADO;
		System.out.println("Carro "+ this.status);

	}

}
