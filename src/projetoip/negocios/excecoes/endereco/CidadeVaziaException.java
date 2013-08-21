package projetoip.negocios.excecoes.endereco;

/**Exceção lançada quando o campo da cidade está vazio
 * @author Guilherme Peixoto	
 * @author Rafael Acevedo*/
public class CidadeVaziaException extends Exception {
	public CidadeVaziaException(){
		super ("Cidade vazia");
	}

}
