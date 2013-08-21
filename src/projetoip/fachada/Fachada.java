package projetoip.fachada;

import java.math.BigDecimal;
import java.util.Vector;

import excel.LeituraCliente;
import excel.LeituraPedidos;
import excel.LeituraProdutos;
import projetoip.dados.classesbase.Cliente;
import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Endereco;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;
import projetoip.dados.excecoes.PedidoNaoCadastradoException;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;
import projetoip.dados.repositorios.Iterator;
import projetoip.negocios.Servicos;
import projetoip.negocios.excecoes.cliente.CPFInvalidoException;
import projetoip.negocios.excecoes.cliente.TelefoneInvalidoException;
import projetoip.negocios.excecoes.endereco.BairroVazioException;
import projetoip.negocios.excecoes.endereco.CidadeVaziaException;
import projetoip.negocios.excecoes.endereco.LogradouroVazioException;
import projetoip.negocios.excecoes.pedido.QuantidadeIncompativelException;
import projetoip.negocios.excecoes.produto.CodigoInvalidoException;
import projetoip.negocios.excecoes.produto.CodigoVazioException;
import projetoip.negocios.excecoes.produto.ValorInvalidoException;

public class Fachada {
	private Servicos servicos;

	public Fachada(Servicos servicos) {
		this.servicos = servicos;
		LeituraCliente lc = new LeituraCliente();
		LeituraProdutos lprod = new LeituraProdutos();
		LeituraPedidos lped = new LeituraPedidos();
		lc.lerClientes(servicos);
		lprod.lerProdutos(servicos);
		lped.lerPedidos(servicos);
	}

	/**
	 * Cadastra um cliente
	 * 
	 * @param cpf
	 * @param telefone
	 * @param nome
	 * @param logradouro
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cidade
	 * @param observacoes
	 * @throws ClienteJaCadastradoException
	 * @throws CPFInvalidoException
	 * @throws TelefoneInvalidoException
	 * @throws BairroVazioException
	 * @throws CidadeVaziaException
	 * @throws LogradouroVazioException
	 */
	public void cadastrarCliente(String cpf, String telefone, String nome,
			String logradouro, String numero, String complemento,
			String bairro, String cidade, String observacoes)
			throws ClienteJaCadastradoException, CPFInvalidoException,
			TelefoneInvalidoException, BairroVazioException,
			CidadeVaziaException, LogradouroVazioException {

		Cliente cliente = new Cliente(cpf, telefone, nome, new Endereco(
				logradouro, numero, complemento, bairro, cidade), observacoes);
		this.servicos.adicionarCliente(cliente);
	}

	/**
	 * Remove um cliente
	 * 
	 * @param telefone
	 * @throws ClienteNaoCadastradoException
	 */
	public void removerCliente(String telefone)
			throws ClienteNaoCadastradoException {
		this.servicos.removerCliente(telefone);
	}

	/**
	 * Procurar um cliente
	 * 
	 * @param telefone
	 * @throws ClienteNaoCadastradoException
	 */
	public Cliente procurarCliente(String telefone) throws ClienteNaoCadastradoException {
		return this.servicos.procurarCliente(telefone);
	}

	/**
	 * Procurar varios clientes
	 * 
	 * @param nome
	 * @throws ClienteNaoCadastradoException
	 */
	public Iterator<Cliente> procurarClientes(String nome) throws ClienteNaoCadastradoException {
		return this.servicos.procurarClientes(nome);
	}
	/**
	 * Cadastra um produto
	 * @param codigo
	 * @param nome
	 * @param descricao
	 * @param tamanho
	 * @param valor
	 * @throws CodigoInvalidoException
	 * @throws ValorInvalidoException
	 * @throws ProdutoJaCadastradoException
	 */
	public void cadastrarProduto(String codigo, String nome, String descricao,
			String tamanho, BigDecimal valor) throws CodigoInvalidoException,
			ValorInvalidoException, ProdutoJaCadastradoException {
		
		Produto produto = new Produto(codigo, nome, descricao, tamanho, valor);
		this.servicos.adicionarProduto(produto);
	}
	/**
	 * Remove um produto
	 * @param codigo
	 * @throws ProdutoNaoCadastradoException
	 */
	public void removerProduto(String codigo) throws ProdutoNaoCadastradoException{
		this.servicos.removerProduto(codigo);
	}
	/**
	 * Procura um produto
	 * @param codigo
	 * @throws ProdutoNaoCadastradoException
	 */
	public Produto procurarProduto(String codigo) throws ProdutoNaoCadastradoException{
		return this.servicos.procurarProduto(codigo);
	}
	/**
	 * Procurar varios produtos
	 * @param nome
	 * @throws ProdutoNaoCadastradoException
	 */
	public Iterator<Produto> procurarProdutos(String nome) throws ProdutoNaoCadastradoException{
		return this.servicos.procurarProdutos(nome);
	}
	/**
	 * Cadastrar pedido
	 * @param codigo
	 * @param telCliente
	 * @param produtos
	 * @throws ClienteNaoCadastradoException
	 * @throws CodigoInvalidoException
	 * @throws CodigoVazioException
	 * @throws QuantidadeIncompativelException
	 */
	public void cadastrarPedido(String codigo,String telCliente,Vector<Produto> produtos) throws ClienteNaoCadastradoException, CodigoInvalidoException, CodigoVazioException, QuantidadeIncompativelException{
		Cliente cliente=this.procurarCliente(telCliente);
		Data data = new Data();
		Pedido pedido = new Pedido(codigo,cliente,produtos,produtos.size(),data);
		this.servicos.adicionarPedido(pedido);
	}
	
	public void removerPedido(String codigo) throws PedidoNaoCadastradoException{
		this.servicos.removerPedido(codigo);
	}
	
	public Pedido procurarPedido(String codigo) throws PedidoNaoCadastradoException{
		return this.servicos.procurarPedido(codigo);
	}
	
	public Iterator<Pedido> procurarPedidos(Data dataInicio,Data dataFim){
		return this.servicos.procurarPedidos(dataInicio, dataFim);
	}
}
