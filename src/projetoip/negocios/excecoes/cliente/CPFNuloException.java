package projetoip.negocios.excecoes.cliente;

/**Exce��o lan�ada quando o campo do CPF est� vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class CPFNuloException extends Exception{
	public CPFNuloException(){
		super("CPF vazio!");
	}
}
