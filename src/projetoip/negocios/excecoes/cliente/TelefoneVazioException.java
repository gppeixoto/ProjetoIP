package projetoip.negocios.excecoes.cliente;

/**Exceção lançada quando o campo do telefone está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class TelefoneVazioException extends Exception{
	public TelefoneVazioException(){
		super("Telefone vazio");
	}
}
