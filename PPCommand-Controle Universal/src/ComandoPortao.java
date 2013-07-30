
public class ComandoPortao implements Comando {

	private Portao portao;
	
	ComandoPortao(Portao p){
		this.portao = p;
	}
	@Override
	public void fazer() {
		// TODO Auto-generated method stub
		this.portao.abrir();

	}

	@Override
	public void desfazer() {
		// TODO Auto-generated method stub
		this.portao.fechar();

	}

}
