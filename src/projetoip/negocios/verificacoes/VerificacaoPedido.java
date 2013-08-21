package projetoip.negocios.verificacoes;

import projetoip.dados.classesbase.Pedido;
import projetoip.negocios.excecoes.produto.CodigoInvalidoException;
import projetoip.negocios.excecoes.produto.CodigoVazioException;

public class VerificacaoPedido {
	private Pedido pedido;
	
	public VerificacaoPedido(Pedido pedido){
		this.pedido=pedido;
	}
	
	public boolean verificar() throws CodigoInvalidoException, CodigoVazioException{
		try{
			Double.parseDouble(this.pedido.getCodigo());
		}
		catch(NumberFormatException e){
			throw new CodigoInvalidoException();
		}
		if(this.pedido.getCodigo().equals("")){
			throw new CodigoVazioException();
		}
		return true;
	}
}
