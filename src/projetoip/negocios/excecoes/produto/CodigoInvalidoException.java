package projetoip.negocios.excecoes.produto;

/**Exce��o lan�ada quando o c�digo estiver formatado incorretamente
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class CodigoInvalidoException extends Exception {
	public CodigoInvalidoException(){
		super("Codigo est� formatado incorretamente");
	}
}
