package projetoip.dados.repositorios;

public class RepositoriosFile extends Repositorios{
	private RepClientesFile clientesFile;
	private RepProdutosFile produtosFile;
	private RepPedidoFile pedidosFile;
	public RepositoriosFile(){
		super(new RepClientesFile(),new RepProdutosFile(), new RepPedidoFile());
		this.clientesFile=new RepClientesFile();
		this.produtosFile= new RepProdutosFile();
		this.pedidosFile= new RepPedidoFile();
	}
	public RepClientesFile getClientesFile() {
		return clientesFile;
	}
	public RepProdutosFile getProdutosFile() {
		return produtosFile;
	}
	public RepPedidoFile getPedidosFile() {
		return pedidosFile;
	}
	
}
