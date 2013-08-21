package projetoip.dados.excecoes;

public class PedidoNaoCadastradoException extends Exception{
	public PedidoNaoCadastradoException(){
		super("Pedido nao encontrado");
	}
}