package projetoip.negocios.excecoes.pedido;

/**Exce��o lan�ada quando o campo do valor est� vazio
 * @author Guilherme Pexioto
 * @author Rafael Acevedo*/
public class ValorVazioException extends Exception{
	public ValorVazioException(){
		super("Valor vazio");
	}
}
