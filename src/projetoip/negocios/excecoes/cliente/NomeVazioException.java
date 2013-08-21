package projetoip.negocios.excecoes.cliente;

/**Exceção lançada quando o campo do nome está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class NomeVazioException extends Exception{
	public NomeVazioException(){
		super("Nome vazio");
	}
}
