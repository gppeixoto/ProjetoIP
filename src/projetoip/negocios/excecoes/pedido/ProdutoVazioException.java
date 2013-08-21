package projetoip.negocios.excecoes.pedido;

/**Exceção lançada quando o campo do produto está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ProdutoVazioException extends Exception {
	public ProdutoVazioException(){
		super("Produto vazio");
	}
}
