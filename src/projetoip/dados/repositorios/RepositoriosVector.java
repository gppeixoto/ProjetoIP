package projetoip.dados.repositorios;

import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;

public class RepositoriosVector extends Repositorios{
	public RepositoriosVector(){
		super(new RepositorioClientesVector(),new RepositorioProdutosVector(),new RepositorioPedidoVector());
	}
	public void carregar(RepositoriosFile rep){
		try {
			((RepositorioClientesVector)this.clientes()).carregar((RepClientesFile)rep.clientes());
			((RepositorioProdutosVector)this.produtos()).carregar((RepProdutosFile)rep.produtos());
		} catch (ClienteJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ProdutoJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((RepositorioPedidoVector)this.pedidos()).carregar((RepPedidoFile)rep.pedidos());
	}
}
