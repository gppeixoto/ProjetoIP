
/*
 * sistema controla o cadastro de clientes e registra as seguintes
 * informações de cada um: CPF do cliente* Telefone do cliente* Nome do
 * cliente* Endereço para entrega [Logradouro*, Número*, Complemento,
 * Bairro*, Cidade*] Observações A planilha Clientes do arquivo Delivery.xls
 * (
 * http://www.cin.ufpe.br/~if669/files/MaterialDeEnsino/Projeto/Delivery.xls
 * ) contem cadastros de alguns clientes. Não deve ser possível inserir dois
 * cadastros para o mesmo telefone. Os campos com asteriscos
 */
package projetoip.dados.classesbase;

import java.io.Serializable;

public class Endereco implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -1572899194938067430L;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;

	public Endereco(String logradouro, String numero, String complemento,
			String bairro, String cidade) {

		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
