package projetoip.negocios.excecoes.pedido;

/**Exce��o lan�ada quando o campo da data est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class DataInvalidaException extends Exception {
	public DataInvalidaException(){
		super("Data inv�lida");
	}
}
