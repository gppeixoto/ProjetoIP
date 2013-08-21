package projetoip.dados.repositorios;

import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;



public class RepositoriosArray extends Repositorios{
	public RepositoriosArray(){
		super(new RepositorioClientesArray(),new RepositorioProdutosArray(),new RepositorioPedidoArray());
	}
	public void carregar(RepositoriosFile rep){
		try {
			((RepositorioClientesArray)this.clientes()).carregar((RepClientesFile)rep.clientes());
			((RepositorioPedidoArray)this.pedidos()).carregar((RepPedidoFile)rep.pedidos());
			((RepositorioProdutosArray)this.produtos()).carregar((RepProdutosFile)rep.produtos());
		} catch (ClienteJaCadastradoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		catch (ProdutoJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
