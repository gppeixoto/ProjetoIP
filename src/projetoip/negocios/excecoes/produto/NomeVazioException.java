package projetoip.negocios.excecoes.produto;

/**Exce��o lan�ada quando o campo do nome est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class NomeVazioException extends Exception{
	public NomeVazioException(){
		super("Nome vazio");
	}
}
