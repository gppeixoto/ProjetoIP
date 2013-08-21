package projetoip.negocios.excecoes.pedido;

public class QuantidadeIncompativelException extends Exception{
	/**
	 * Construtor
	 */
	public QuantidadeIncompativelException(){
		super("Quantidade de produtos nao confere!");
	}

}
