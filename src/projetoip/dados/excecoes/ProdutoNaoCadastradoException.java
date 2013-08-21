package projetoip.dados.excecoes;

public class ProdutoNaoCadastradoException extends Exception{
	public ProdutoNaoCadastradoException(){
		super("Produto nao cadastrado!");
	}
}
