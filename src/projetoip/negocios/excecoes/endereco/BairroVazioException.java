package projetoip.negocios.excecoes.endereco;

/**Exceção lançada quando o campo do bairro está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class BairroVazioException extends Exception{
	public BairroVazioException (){
		super("Bairro vazio");
	}

}