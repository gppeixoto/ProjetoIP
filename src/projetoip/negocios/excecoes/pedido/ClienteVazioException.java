package projetoip.negocios.excecoes.pedido;

/**Exce��o lan�ada quando o campo do cliente est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ClienteVazioException extends Exception{
	public ClienteVazioException(){
		super("Cliente vazio");
	}
}
