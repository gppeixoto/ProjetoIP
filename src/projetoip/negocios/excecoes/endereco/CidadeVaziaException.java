package projetoip.negocios.excecoes.endereco;

/**Exce��o lan�ada quando o campo da cidade est� vazio
 * @author Guilherme Peixoto	
 * @author Rafael Acevedo*/
public class CidadeVaziaException extends Exception {
	public CidadeVaziaException(){
		super ("Cidade vazia");
	}

}
