package projetoip.negocios.excecoes.pedido;

/**Exceção lançada quando o campo do cliente está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ClienteVazioException extends Exception{
	public ClienteVazioException(){
		super("Cliente vazio");
	}
}
