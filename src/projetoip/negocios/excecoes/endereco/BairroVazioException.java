package projetoip.negocios.excecoes.endereco;

/**Exce��o lan�ada quando o campo do bairro est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class BairroVazioException extends Exception{
	public BairroVazioException (){
		super("Bairro vazio");
	}

}