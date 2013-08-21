package projetoip.dados.excecoes;

public class ClienteNaoCadastradoException extends Exception{
	public ClienteNaoCadastradoException(){
		super("Cliente nao cadastrado");
	}
}
