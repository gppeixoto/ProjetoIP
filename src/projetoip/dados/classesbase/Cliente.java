
package projetoip.dados.classesbase;

import java.io.Serializable;

/**
 * Classe base que representa o cliente
 * @author Guilherme Peixoto
 * @author Rafael Acevedo
 *
 */
public class Cliente implements Serializable{

	
	private static final long serialVersionUID = -8959948550563209209L;
	private String cpf;
	private String telefone;
	private String nome;
	private Endereco endereco;
	private String observacoes;
	private int numPedidos;
	/**
	 * Construtor com observações
	 * @param cpf
	 * @param telefone
	 * @param nome
	 * @param endereco
	 * @param observacoes
	 */
	public Cliente (String cpf, String telefone, String nome, Endereco endereco, String observacoes){
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.endereco = endereco;
		this.observacoes = observacoes;
		this.numPedidos=0;
	}

	/**
	 * Retorna o cpf do cliente
	 * @return {@link String} cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Seta o cpf do cliente
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Retorna o telefone do cliente
	 * @return {@link String} cpf
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Seta o telefone do cliente
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Retorna o nome do cliente
	 * @return {@link String} nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Seta o nome do cliente
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o endereço do cliente
	 * @return {@link Endereco} endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * Seta o endereço do cliente
	 * @param endereco (Endereco)
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * Retorna as observações do cliente
	 * @return {@link String} observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * Seta as observações do cliente
	 * @param observacoes (String)
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	/**
	 * Retorna o número de pedidos realizados pelo cliente
	 * @return int numPedidos
	 */
	public int getNumPedidos() {
		return numPedidos;
	}

	/**
	 * Seta o número de pedidos realizados pelo cliente
	 * @param numPedidos (int)
	 */
	public void setNumPedidos(int numPedidos) {
		this.numPedidos = numPedidos;
	}
	
	/**
	 * Método que incrementa o número de pedidos realizados a cada pedido feito
	 * pelo cliente
	 */
	public void addNumPedidos(){
		this.numPedidos++;
	}
	
}
