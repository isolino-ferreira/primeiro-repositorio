
public class PortaoImpl implements Portao {

	private Status status;
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.status = Status.ABERTO;
		System.out.println("Port�o "+this.status);

	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.status = Status.FECHADO;
		System.out.println("Port�o "+this.status);

	}

}
