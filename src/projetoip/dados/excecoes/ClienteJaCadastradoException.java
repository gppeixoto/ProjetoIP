package projetoip.dados.excecoes;


public class ClienteJaCadastradoException extends Exception{
	public ClienteJaCadastradoException(){
		super("Este cliente j� est� cadastrado no sistema!");
	}
}
