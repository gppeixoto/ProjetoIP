package projetoip.negocios.excecoes.cliente;

/**Exce��o lan�ada quando o formato do CPF est� digitado incorretamente
 * @author Rafael Acevedo
 * @author Guilherme Peixoto
 */
public class CPFInvalidoException extends Exception {
	public CPFInvalidoException() {
		super("CPF est� formatado incorretamente");
	}
}