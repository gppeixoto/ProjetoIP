package projetoip.negocios.excecoes.endereco;

/**Exceção lançada quando o campo do logradouro está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class LogradouroVazioException extends Exception {
	public LogradouroVazioException(){
		super("Logradouro vazio");
	}
}
