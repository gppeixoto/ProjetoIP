package projetoip.negocios.excecoes.produto;

/**Exce��o lan�ada quando o valor est� formatado incorretamente
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class ValorInvalidoException extends Exception{
	public ValorInvalidoException(){
		super("Valor inv�lido");
	}
}
