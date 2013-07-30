import java.util.ArrayList;


public class ControleRemotoImpl implements ControleRemoto {

	ArrayList<Comando> comandos = new ArrayList<Comando>();
	
	@Override
	public void setComando(Comando c) {
		// TODO Auto-generated method stub
		this.comandos.add(c);

	}

	@Override
	public void botaoFazer(int aparelho) {
		// TODO Auto-generated method stub
		this.comandos.get(aparelho).fazer();

	}

	@Override
	public void botaoDesfazer(int aparelho) {
		// TODO Auto-generated method stub
		this.comandos.get(aparelho).desfazer();

	}

}
