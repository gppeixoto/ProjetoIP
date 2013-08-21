package projetoip.negocios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


import projetoip.dados.classesbase.Cliente;
import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;
import projetoip.dados.excecoes.PedidoNaoCadastradoException;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;
import projetoip.dados.repositorios.*;
import projetoip.negocios.excecoes.cliente.CPFInvalidoException;
import projetoip.negocios.excecoes.cliente.TelefoneInvalidoException;
import projetoip.negocios.excecoes.endereco.BairroVazioException;
import projetoip.negocios.excecoes.endereco.CidadeVaziaException;
import projetoip.negocios.excecoes.endereco.LogradouroVazioException;
import projetoip.negocios.excecoes.pedido.QuantidadeIncompativelException;
import projetoip.negocios.excecoes.produto.CodigoInvalidoException;
import projetoip.negocios.excecoes.produto.CodigoVazioException;
import projetoip.negocios.excecoes.produto.ValorInvalidoException;
import projetoip.negocios.verificacoes.VerificacaoCliente;
import projetoip.negocios.verificacoes.VerificacaoEndereco;
import projetoip.negocios.verificacoes.VerificacaoPedido;
import projetoip.negocios.verificacoes.VerificacaoProduto;
/**
 * Classe que contém os servicos do sistema
 * @author Rafael Acevedo
 * @author Guilherme Peixoto
 *
 */
public class Servicos {
	private Repositorios rep;
	/*private RepositorioClientesVector repClientesVector;
	private RepositorioClientesArray repClientesArray;
	private RepClientesFile repClientesFile;
	private RepositorioProdutosVector repProdutosVector;
	private RepositorioProdutosArray repProdutosArray;
	private RepProdutosFile repProdutosFile;
	private RepositorioPedidoVector repPedidosVector;
	private RepositorioPedidoArray repPedidosArray;
	private RepPedidoFile repPedidosFile;*/
	
	private String tipo;
	/**
	 * Construtor de Serviços
	 */
	public Servicos(){

		/*this.repFile= new RepositoriosFile();
		this.repClientesArray = new RepositorioClientesArray();
		this.repClientesFile = new RepClientesFile();
		this.repClientesVector = new RepositorioClientesVector();
		this.repProdutosArray = new RepositorioProdutosArray();
		this.repProdutosVector = new RepositorioProdutosVector();
		this.repProdutosFile = new RepProdutosFile();
		this.repPedidosArray = new RepositorioPedidoArray();
		this.repPedidosVector = new RepositorioPedidoVector();
		this.repPedidosFile = new RepPedidoFile();*/

		FileInputStream fis;
		this.tipo=null;
		try {
			fis = new FileInputStream("src/config.txt");
			InputStreamReader istreamrd = new InputStreamReader(fis);
			BufferedReader bufread = new BufferedReader(istreamrd);
			this.tipo = bufread.readLine();
			bufread.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e1) {
			e1.printStackTrace();
		}
		if(tipo.equalsIgnoreCase("array")){
			RepositoriosArray array= new RepositoriosArray();
			this.rep=array;
			/*this.repClientesArray = new RepositorioClientesArray();
			this.repProdutosArray = new RepositorioProdutosArray();
			this.repPedidosArray = new RepositorioPedidoArray();*/
		}else if(tipo.equalsIgnoreCase("vector")){
			RepositoriosVector vector= new RepositoriosVector();
			this.rep=vector;
			/*this.repClientesVector = new RepositorioClientesVector();
			this.repProdutosVector = new RepositorioProdutosVector();
			this.repPedidosVector = new RepositorioPedidoVector();*/
		}else if(tipo.equalsIgnoreCase("arquivo")){
			RepositoriosFile file = new RepositoriosFile();
			this.rep=file;
			/*this.repClientesFile = new RepClientesFile();
			this.repProdutosFile = new RepProdutosFile();
			this.repPedidosFile = new RepPedidoFile();*/
		}
	}
	/**
	 * Adiciona um cliente ao repositorio escolhido
	 * @param cliente ->cliente a ser adicionado
	 * @throws ClienteJaCadastradoException 
	 * @throws CPFInvalidoException
	 * @throws TelefoneInvalidoException
	 * @throws LogradouroVazioException 
	 * @throws CidadeVaziaException 
	 * @throws BairroVazioException 
	 */
	public void adicionarCliente(Cliente cliente) throws ClienteJaCadastradoException, CPFInvalidoException, TelefoneInvalidoException, BairroVazioException, CidadeVaziaException, LogradouroVazioException{
		VerificacaoEndereco verificarEndereco= new VerificacaoEndereco(cliente.getEndereco());
		VerificacaoCliente verificarCliente=new VerificacaoCliente(cliente);
		if(verificarCliente.verificar() && verificarEndereco.verificar()){
			rep.clientes().inserir(cliente);
			/*if(tipo.equalsIgnoreCase("array")){
				this.repClientesArray.inserir(cliente);
			}else if(tipo.equalsIgnoreCase("vector")){
				this.repClientesVector.inserir(cliente);
			}else if(tipo.equalsIgnoreCase("arquivo")){
				this.repClientesArray.inserir(cliente);
			}*/
		}
	}
	/**
	 * Adiciona um produto ao repositorio escolhido
	 * @param produto ->produto a ser adicionado
	 * @throws CodigoInvalidoException
	 * @throws ValorInvalidoException
	 * @throws ProdutoJaCadastradoException
	 */
	public void adicionarProduto(Produto produto) throws CodigoInvalidoException, ValorInvalidoException, ProdutoJaCadastradoException{
		VerificacaoProduto ver = new VerificacaoProduto(produto);
		if(ver.verificar()){
			rep.produtos().inserir(produto);
			/*if (tipo.equalsIgnoreCase("array")){
				this.repProdutosArray.inserir(produto);
			} else if (tipo.equalsIgnoreCase("vector")){
				this.repProdutosVector.inserir(produto);
			} else if (tipo.equalsIgnoreCase("arquivo")){
				this.repProdutosFile.inserir(produto);
			}*/
		}
	}
	/**
	 * Adiciona um pedido ao repositorio escolhido
	 * @param pedido ->pedido a ser adicionado
	 * @throws CodigoInvalidoException
	 * @throws CodigoVazioException
	 * @throws QuantidadeIncompativelException
	 */
	public void adicionarPedido(Pedido pedido) throws CodigoInvalidoException, CodigoVazioException, QuantidadeIncompativelException{
		VerificacaoPedido verificarPedido = new VerificacaoPedido(pedido);
		if(verificarPedido.verificar()){
			if(this.rep.pedidos().tamanho()!=pedido.getQuantidade()){
				throw new QuantidadeIncompativelException();
			}
			this.calculaValor(pedido);
			rep.pedidos().inserir(pedido);
			/*if (tipo.equalsIgnoreCase("array")){
				this.repPedidosArray.inserir(pedido);
			} else if (tipo.equalsIgnoreCase("vector")){
				this.repPedidosVector.inserir(pedido);
			} else if (tipo.equalsIgnoreCase("arquivo")){
				this.repPedidosFile.inserir(pedido);
			}*/
		}
	}

	/**
	 * Calcula o valor de um pedido
	 * @param pedido -> pedido cujo valor vai ser calculado
	 */
	private void calculaValor(Pedido pedido){
		BigDecimal precoFinal=pedido.getValor();
		BigDecimal valorEntrega=BigDecimal.ZERO;
		String bairro=pedido.getCliente().getEndereco().getBairro();
		//calcula a taxa de entrega de acordo com os bairros
		if(bairro.equalsIgnoreCase("aflitos")||bairro.equalsIgnoreCase("graças")||bairro.equalsIgnoreCase("espinheiro")||
				bairro.equalsIgnoreCase("tamarineira")||bairro.equalsIgnoreCase("jaqueira")||bairro.equalsIgnoreCase("torre")||
				bairro.equalsIgnoreCase("parnamirim")||bairro.equalsIgnoreCase("casa forte")||bairro.equalsIgnoreCase("apipucos")||
				bairro.equalsIgnoreCase("casa amarela")||bairro.equalsIgnoreCase("aflitos")||
				bairro.equalsIgnoreCase("hipódromo")||bairro.equalsIgnoreCase("rosarinho")||bairro.equalsIgnoreCase("campo grande")||
				bairro.equalsIgnoreCase("torrões")){
			valorEntrega=valorEntrega.add(new BigDecimal(3.5));
		}else{
			valorEntrega=valorEntrega.add(new BigDecimal(7.0));
		}
		//calcula o preco do pedido somando os precos dos produtos
		for(int i = 0;i<pedido.getProdutos().size();i++){
			precoFinal=precoFinal.add(pedido.getProdutos().get(i).getValor());
		}

		//calcula o desconto na taxa de entrega
		if(pedido.getQuantidade()>5){
			double valorDescontado = 0.10*(pedido.getQuantidade()-5);
			valorEntrega=valorEntrega.subtract(valorEntrega.multiply(new BigDecimal(valorDescontado)));
		}
		precoFinal=precoFinal.add(valorEntrega);
		//quando o cliente realiza o 5 pedido, tem o produto de menor valor do proximo pedido de graça
		if(pedido.getQuantidade()>=5&& pedido.getCliente().getNumPedidos()%5==0){
			BigDecimal maisBarato=pedido.getProdutos().get(0).getValor();
			for(int i = 1;i<pedido.getProdutos().size();i++){
				if(pedido.getProdutos().get(i).getValor().doubleValue()<maisBarato.doubleValue()){
					maisBarato=pedido.getProdutos().get(i).getValor();
				}
			}
			precoFinal=precoFinal.subtract(maisBarato);
		}
		pedido.setValor(precoFinal);
	}
	
	/**
	 * Remove um cliente do repositorio escolhido
	 * @param cliente ->cliente a ser removido
	 * @throws ClienteNaoCadastradoException
	 */
	public void removerCliente(String telefone) throws ClienteNaoCadastradoException{
		rep.clientes().remover(telefone);
		/*if (tipo.equalsIgnoreCase("array")){
			this.repClientesArray.remover(cliente.getTelefone());
		} else if (tipo.equalsIgnoreCase("vector")){
			this.repClientesVector.remover(cliente.getTelefone());
		} else if (tipo.equalsIgnoreCase("arquivo")){
			this.repClientesFile.remover(cliente.getTelefone());
		}*/
		
	}
	/**
	 * Remove um produto do repositorio escolhido
	 * @param produto -> produto a ser removido
	 * @throws ProdutoNaoCadastradoException
	 */
	public void removerProduto(String codigo) throws ProdutoNaoCadastradoException{
		rep.produtos().remover(codigo);
		/*if (tipo.equalsIgnoreCase("array")){
			this.repProdutosArray.remover(produto.getCodigo());
		} else if (tipo.equalsIgnoreCase("vector")){
			this.repProdutosVector.remover(produto.getCodigo());
		} else if (tipo.equalsIgnoreCase("arquivo")){
			this.repProdutosFile.remover(produto.getCodigo());
		}*/
	}
	
	/**
	 * Remove um pedido do repositorio escolhido
	 * @param pedido
	 * @throws PedidoNaoCadastradoException
	 */
	public void removerPedido(String codigo) throws PedidoNaoCadastradoException{
		rep.pedidos().remover(codigo);
		
		/*if (tipo.equalsIgnoreCase("array")){
			this.repPedidosArray.remover(pedido.getCodigo());
		} else if (tipo.equalsIgnoreCase("vector")){
			this.repPedidosVector.remover(pedido.getCodigo());
		} else if (tipo.equalsIgnoreCase("arquivo")){
			this.repPedidosFile.remover(pedido.getCodigo());
		}*/
	}
	
	/**
	 * Procura os clientes que tem uma parte do nome passado como parametro
	 * @param nome
	 * @return iterator com os clientes procurados
	 * @throws ClienteNaoCadastradoException
	 */
	public Iterator<Cliente> procurarClientes(String nome) throws ClienteNaoCadastradoException{
		Iterator<Cliente> iterator = rep.clientes().procurarNome(nome);
		/*if(tipo.equalsIgnoreCase("array")){
			iterator=this.repClientesArray.procurarNome(nome);
		}else if(tipo.equalsIgnoreCase("vector")){
			iterator=this.repClientesVector.procurarNome(nome);
		}else if(tipo.equalsIgnoreCase("arquivo")){
			iterator=this.repClientesFile.procurarNome(nome);
		}*/
		return iterator;
	}
	
	/**
	 * Procura os produtos que tem uma parte do nome passado como parametro
	 * @param nome
	 * @return iterator com os produtos procurados
	 * @throws ProdutoNaoCadastradoException
	 */
	public Iterator<Produto> procurarProdutos(String nome) throws ProdutoNaoCadastradoException{
		Iterator<Produto> iterator = rep.produtos().procurarNome(nome);
		/*if(tipo.equalsIgnoreCase("array")){
			iterator=this.repProdutosArray.procurarNome(nome);
		}else if(tipo.equalsIgnoreCase("vector")){
			iterator=this.repProdutosVector.procurarNome(nome);
		}else if(tipo.equalsIgnoreCase("arquivo")){
			iterator=this.repProdutosFile.procurarNome(nome);
		}*/
		return iterator;
	}
	
	/**
	 * Procura os pedidos que estao entre as datas limite
	 * @param dataInicio
	 * @param dataFim
	 * @return iterator com os pedidos procurados
	 */
	public Iterator<Pedido> procurarPedidos (Data dataInicio, Data dataFim){
		Iterator<Pedido> iterator =rep.pedidos().procurarData(dataInicio, dataFim);
		/*if(tipo.equalsIgnoreCase("array")){
			iterator=this.repPedidosArray.procurarData(dataInicio, dataFim);
		}else if(tipo.equalsIgnoreCase("vector")){
			iterator=this.repPedidosVector.procurarData(dataInicio, dataFim);
		}else if (tipo.equalsIgnoreCase("arquivo")){
			iterator=this.repPedidosFile.procurarData(dataInicio, dataFim);
		}*/
		return iterator;
	}
	/**
	 * Procurar um unico cliente
	 * @param telefone
	 * @return cliente encontrado
	 * @throws ClienteNaoCadastradoException
	 */
	public Cliente procurarCliente(String telefone) throws ClienteNaoCadastradoException{
		return rep.clientes().procurar(telefone);
	}
	/**
	 * Procurar um unico produto
	 * @param codigo 
	 * @return produto encontrado
	 * @throws ProdutoNaoCadastradoException
	 */
	public Produto procurarProduto(String codigo) throws ProdutoNaoCadastradoException{
		return rep.produtos().procurar(codigo);
	}
	/**
	 * Procurar um unico pedido
	 * @param codigo
	 * @return o pedido procurado
	 * @throws PedidoNaoCadastradoException
	 */
	public Pedido procurarPedido(String codigo) throws PedidoNaoCadastradoException{
		return rep.pedidos().procurar(codigo);
	}

}
