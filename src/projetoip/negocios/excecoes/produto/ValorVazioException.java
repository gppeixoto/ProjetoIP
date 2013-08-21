package projetoip.negocios.excecoes.produto;

/**Exceção lançada quando o campo do valor está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ValorVazioException extends Exception{
	public ValorVazioException(){
		super("Valor vazio");
	}
}
