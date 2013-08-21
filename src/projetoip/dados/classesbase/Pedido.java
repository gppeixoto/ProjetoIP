package projetoip.dados.classesbase;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Vector;



/*A aplicação inclui ainda o gerenciamento de pedidos feitos de produtos, por um cliente, em uma data.

 Código*
 Cliente*
 Produtos*
 Data*
 Quantidade de produtos*
 Valor*
 A planilha Pedidos do arquivo Delivery.xls (http://www.cin.ufpe.br/~if669/files/MaterialDeEnsino/Projeto/Delivery.xls) contem
 alguns pedidos, relacionando o telefone dos clientes com os códigos identificadores dos produtos. Todos os campos são
 obrigatórios.
 O valor é calculado automaticamente somando os valores do produto ao valor da taxa de entrega. Para entrega nos bairros Aflitos,
 Graças, Espinheiro, Tamarineira, Jaqueira, Torre, Parnamirim, Casa Forte, Apipucos, Casa Amarela, Hipódromo, Rosarinho,
 Campo Grande e Torrões, o valor da taxa é de R$ 3,50. Para demais bairros, o valor é R$ 7,00.*/

public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7035411498734801825L;
	private String codigo;
	private Cliente cliente;
	private Vector<Produto> produtos;
	private Data data;
	private int quantidade;
	private BigDecimal valor;

	public Pedido(String codigo, Cliente cliente, Vector<Produto> produtos,int quantidade,
			Data data) {
		
		this.codigo = codigo;
		this.cliente = cliente;
		this.produtos = produtos;
		this.data = data;
		this.quantidade=quantidade;
		this.valor = new BigDecimal(0);
	}
	
	/*public Pedido(String codigo,Cliente cliente,Produto[]produtos){
		this.codigo=codigo;
		this.cliente=cliente;
		this.produtos=produtos;
		this.d = new Date();
		String formato = "dd/MM/yyyy";  
		SimpleDateFormat dataformatada = new SimpleDateFormat(formato);
		this.data=dataformatada.format(d);
	}*/
	
	public String getCodigo() {
		
		
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vector<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Vector<Produto> produtos) {
		this.produtos = produtos;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
