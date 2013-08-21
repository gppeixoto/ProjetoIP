package projetoip.negocios.excecoes.cliente;

/**Exceção lançada quando o telefone foi digitado incorretamente 
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class TelefoneInvalidoException extends Exception{
	public TelefoneInvalidoException(){
		super("Telefone está formatado incorretamente");
	}
}
