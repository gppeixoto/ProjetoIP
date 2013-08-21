package projetoip.negocios.excecoes.pedido;

/**Exceção lançada quando o campo da data está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class DataInvalidaException extends Exception {
	public DataInvalidaException(){
		super("Data inválida");
	}
}
