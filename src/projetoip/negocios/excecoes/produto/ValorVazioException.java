package projetoip.negocios.excecoes.produto;

/**Exce��o lan�ada quando o campo do valor est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ValorVazioException extends Exception{
	public ValorVazioException(){
		super("Valor vazio");
	}
}
