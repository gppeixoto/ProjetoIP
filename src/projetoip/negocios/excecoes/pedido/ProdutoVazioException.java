package projetoip.negocios.excecoes.pedido;

/**Exce��o lan�ada quando o campo do produto est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ProdutoVazioException extends Exception {
	public ProdutoVazioException(){
		super("Produto vazio");
	}
}
