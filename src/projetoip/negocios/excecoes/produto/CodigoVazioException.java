package projetoip.negocios.excecoes.produto;

/**Exceção lançada quando o campo do código está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class CodigoVazioException extends Exception{
	public CodigoVazioException(){
		super("Codigo vazio");
	}
}
