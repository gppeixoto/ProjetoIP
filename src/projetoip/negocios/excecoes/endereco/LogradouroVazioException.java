package projetoip.negocios.excecoes.endereco;

/**Exce��o lan�ada quando o campo do logradouro est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class LogradouroVazioException extends Exception {
	public LogradouroVazioException(){
		super("Logradouro vazio");
	}
}
