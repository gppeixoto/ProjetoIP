package projetoip.negocios.excecoes.produto;

/**Exceção lançada quando o valor está formatado incorretamente
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ValorInvalidoException extends Exception{
	public ValorInvalidoException(){
		super("Valor inválido");
	}
}
