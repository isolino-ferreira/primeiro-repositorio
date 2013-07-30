
public class Application {
	public static void run(){
		ControleRemoto cr = new ControleRemotoImpl();
		cr.setComando(new ComandoPortao(new PortaoImpl()));
		cr.setComando(new ComandoCarro(new CarroImpl()));
		cr.botaoFazer(0);
		cr.botaoFazer(1);
		cr.botaoDesfazer(1);
		cr.botaoDesfazer(0);
		System.out.println("Alterando um projeto com git");
		System.out.println("Alteranasdasdasd");
	}
}
