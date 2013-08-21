package projetoip.dados.repositorios;

public abstract class Repositorios {
	private RepositorioClientes clientes;
	private RepositorioProdutos produtos;
	private RepositorioPedido pedidos;
	
	public Repositorios(RepositorioClientes clientes, RepositorioProdutos produtos,RepositorioPedido pedidos){
		super();
		this.clientes=clientes;
		this.pedidos=pedidos;
		this.produtos=produtos;
	}
	/**
	 * 
	 * @return clientes repositorio de clientes
	 */
	public RepositorioClientes clientes(){
		return this.clientes;
	}
	/**
	 * 
	 * @return produtos repositorio de produtos
	 */
	public RepositorioProdutos produtos(){
		return this.produtos;
	}
	/**
	 * 
	 * @return pedidos repositorio de pedidos
	 */
	public RepositorioPedido pedidos(){
		return this.pedidos;
	}
}
