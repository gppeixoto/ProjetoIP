package projetoip.negocios.excecoes.produto;

/**Exce��o lan�ada quando o campo do tamanho est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class TamanhoVazioException extends Exception{
	public TamanhoVazioException(){
		super("Tamanho vazio");
	}
}
