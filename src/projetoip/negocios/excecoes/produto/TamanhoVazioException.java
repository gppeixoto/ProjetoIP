package projetoip.negocios.excecoes.produto;

/**Exceção lançada quando o campo do tamanho está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class TamanhoVazioException extends Exception{
	public TamanhoVazioException(){
		super("Tamanho vazio");
	}
}
