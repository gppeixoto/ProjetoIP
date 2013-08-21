package projetoip.dados.excecoes;


public class ClienteJaCadastradoException extends Exception{
	public ClienteJaCadastradoException(){
		super("Este cliente já está cadastrado no sistema!");
	}
}
