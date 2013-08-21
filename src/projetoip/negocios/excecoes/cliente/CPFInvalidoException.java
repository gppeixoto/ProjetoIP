package projetoip.negocios.excecoes.cliente;

/**Exceção lançada quando o formato do CPF está digitado incorretamente
 * @author Rafael Acevedo
 * @author Guilherme Peixoto
 */
public class CPFInvalidoException extends Exception {
	public CPFInvalidoException() {
		super("CPF está formatado incorretamente");
	}
}