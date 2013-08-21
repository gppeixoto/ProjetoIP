package projetoip.negocios.excecoes.produto;

/**Exceção lançada quando o código estiver formatado incorretamente
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class CodigoInvalidoException extends Exception {
	public CodigoInvalidoException(){
		super("Codigo está formatado incorretamente");
	}
}
