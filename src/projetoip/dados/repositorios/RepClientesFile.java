package projetoip.dados.repositorios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import projetoip.dados.classesbase.Cliente;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;



public class RepClientesFile implements RepositorioClientes,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2194817879694343202L;
	/**
	 * 
	 */

	private RepositorioClientesVector lista;
	
	public RepClientesFile(){
		if(this.read() == null){	
			this.lista = new RepositorioClientesVector();			
			this.write();			
		}else{
			this.lista = this.read();
		}
	}
	private void write(){		
		try {
			FileOutputStream fos = new FileOutputStream("teste.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.lista);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public RepositorioClientesVector read(){
		RepositorioClientesVector rep  = null;
		try {			
			FileInputStream os = new FileInputStream("teste.dat");
			ObjectInputStream input = new ObjectInputStream(os);

			rep= (RepositorioClientesVector) input.readObject();
			input.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rep;
	}
	public void inserir(Cliente cliente) throws ClienteJaCadastradoException {
		this.lista = this.read();

		this.lista.inserir(cliente);
		this.write();
		
	}

	
	public Cliente procurar(String telefone)
			throws ClienteNaoCadastradoException {
		return this.lista.procurar(telefone);
	}

	
	public Iterator<Cliente> procurarNome(String nome)
			throws ClienteNaoCadastradoException {
		return this.lista.procurarNome(nome);
	}

	
	public void remover(String telefone) throws ClienteNaoCadastradoException {
		this.lista = this.read();
		this.lista.remover(telefone);
		this.write();
		
	}

	
	public boolean existe(String telefone) {
		return this.lista.existe(telefone);
	}
	
	public void addNumPedidos(Cliente cliente) {
		try {
			Cliente cl=this.procurar(cliente.getTelefone());
			cl.addNumPedidos();
		} catch (ClienteNaoCadastradoException e) {
			e.printStackTrace();
		}
	}
	
	/*TESTE
	 * public static void main(String[] args) {
		RepClientesFile r = new RepClientesFile();
		Endereco endereco = new Endereco("Rua tal", "001", "apt 101", "Boa viagem", "Recife");
		Cliente cliente = new Cliente("10150035403","34678778", "Rafael", endereco, "nada");
		Endereco endereco2 = new Endereco("Rua sei la", "002", "apt 601", "Boa viagem", "Olinda");
		Cliente cliente2 = new Cliente("11111111111", "33333333", "Ze", endereco2, "pn");
		try {
			r.remover("33333333");
		} catch (ClienteNaoCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
}
