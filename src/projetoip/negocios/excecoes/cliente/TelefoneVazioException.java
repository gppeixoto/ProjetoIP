package projetoip.negocios.excecoes.cliente;

/**Exce��o lan�ada quando o campo do telefone est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class TelefoneVazioException extends Exception{
	public TelefoneVazioException(){
		super("Telefone vazio");
	}
}
