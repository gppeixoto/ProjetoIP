package projetoip.negocios.excecoes.cliente;

/**Exceção lançada quando o campo do CPF está vazio
 * @author Guilherme Peixoto
 * @author Rafael Acevedo*/
public class CPFNuloException extends Exception{
	public CPFNuloException(){
		super("CPF vazio!");
	}
}
