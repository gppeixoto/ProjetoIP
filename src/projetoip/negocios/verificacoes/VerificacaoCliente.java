package projetoip.negocios.verificacoes;
import projetoip.dados.classesbase.Cliente;
import projetoip.negocios.excecoes.cliente.CPFInvalidoException;
import projetoip.negocios.excecoes.cliente.TelefoneInvalidoException;

public class VerificacaoCliente {
	
	private Cliente cliente;
	
	public VerificacaoCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public boolean verificar() throws CPFInvalidoException, TelefoneInvalidoException{
		if (!cliente.getCpf().matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")){
			throw new CPFInvalidoException();
		}else if(!cliente.getTelefone().matches("\\d{4}-\\d{4}")){
			throw new TelefoneInvalidoException();
		}
		return true;
	}
	
}
