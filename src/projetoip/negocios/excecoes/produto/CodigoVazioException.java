package projetoip.negocios.excecoes.produto;

/**Exce��o lan�ada quando o campo do c�digo est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class CodigoVazioException extends Exception{
	public CodigoVazioException(){
		super("Codigo vazio");
	}
}
