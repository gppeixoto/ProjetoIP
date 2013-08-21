package projetoip.negocios.excecoes.pedido;

/**Exceção lançada quando o campo do valor está vazio
 * @author Guilherme Pexioto
 * @author Rafael Acevedo*/
public class ValorVazioException extends Exception{
	public ValorVazioException(){
		super("Valor vazio");
	}
}
