package projetoip.negocios.excecoes.cliente;

/**Exce��o lan�ada quando o telefone foi digitado incorretamente 
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class TelefoneInvalidoException extends Exception{
	public TelefoneInvalidoException(){
		super("Telefone est� formatado incorretamente");
	}
}
