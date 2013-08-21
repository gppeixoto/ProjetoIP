package projetoip.dados.classesbase;

import java.io.Serializable;
import java.math.BigDecimal;

/*Al�m dos clientes, o sistema armazena o cadastro dos produtos vendidos pelo restaurante, contendo os seguintes dados:
C�digo identificador*
Nome*
Descri��o
Tamanho*
Valor**
A planilha Produtos do arquivo Delivery.xls (http://www.cin.ufpe.br/~if669/files/MaterialDeEnsino/Projeto/Delivery.xls) contem
cadastros de alguns produtos. N�o deve ser poss�vel inserir dois produtos com o mesmo c�digo identificador. Todos os campos s�o
obrigat�rios, exceto o campo de Descri��o.*/

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6980691701496389024L;
	private String codigo;
	private String nome;
	private String descricao;
	private String tamanho;
	private BigDecimal valor;
	
	public Produto (String codigo, String nome, String descricao, String tamanho, BigDecimal valor){
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.tamanho = tamanho;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
