package projetoip.dados.repositorios;
import java.util.Vector;

import projetoip.dados.classesbase.Cliente;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;

public class RepositorioClientesArray implements RepositorioClientes {
	private Cliente[] array;
	private int indice;

	public RepositorioClientesArray() {
		this.array = new Cliente[10000];
		this.indice = 0;
	}

	public void inserir(Cliente cliente) throws ClienteJaCadastradoException {
		try{
			procurar(cliente.getTelefone());
			throw new ClienteJaCadastradoException();
		}catch(ClienteNaoCadastradoException e){
			if(existeCpf(cliente.getCpf())){
				throw new ClienteJaCadastradoException();
			}
			array[indice]= cliente;
			indice++;
		}
	}
	private boolean existeCpf(String cpf){
		boolean retorno=false;
		for(int i = 0;i<this.indice;i++){
			if(this.array[i].getCpf().equals(cpf)){
				retorno=true;
			}
		}
		return retorno;
	}

	public Cliente procurar(String telefone) throws ClienteNaoCadastradoException {
		Cliente cliente = null;
		for (int i = 0; i < indice; i++) {
			if (array[i].getTelefone().equals(telefone)) {
				cliente = array[i];
			}
		}
		if (cliente.equals(null)) {
			throw new ClienteNaoCadastradoException();
		} else {
			return cliente;
		}

	}
	public Iterator<Cliente> procurarNome(String nome)throws ClienteNaoCadastradoException{
		Vector <Cliente> aux = new Vector<Cliente>();
		boolean achou=false;
		for(int i = 0;i<indice;i++){
			if(array[i].getNome().contains(nome)){
				aux.add(array[i]);
				achou=true;
			}
		}
		if(!achou){
			throw new ClienteNaoCadastradoException();
		}
		Iterator<Cliente>iterator = new Iterator<Cliente>(aux);
		return iterator;
	}

	public void remover(String telefone) throws ClienteNaoCadastradoException {
		int i = getIndice(telefone);
		if (i == this.indice) {
			throw new ClienteNaoCadastradoException();
		} else {
			this.indice = this.indice - 1;
			this.array[i] = this.array[this.indice];
			this.array[this.indice] = null;
		}
	}
	
	private int getIndice(String telefone) {
		boolean achou = false;
		String n;
		int i = 0;
		while (!achou && i < this.indice) {
			n = array[i].getTelefone();
			if (n.equals(telefone)) {
				achou = true;
			} else {
				i++;
			}
		}
		return i;
	}
	
	public boolean existe(String telefone) {
		int i = getIndice(telefone);
		return (i != this.indice);
	}
	public void carregar(RepClientesFile clientes) throws ClienteJaCadastradoException {
		RepositorioClientesVector pedido = clientes.read();
		Vector<Cliente> lista = pedido.getVec();
		for(int i = 0; i<lista.size(); i++){
			this.inserir(lista.get(i));
		}

	}
	
	public Cliente[] getArray() {
		return array;
	}

	public void setArray(Cliente[] array) {
		this.array = array;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	
	public void addNumPedidos(Cliente cliente) {
		try {
			Cliente cl=this.procurar(cliente.getTelefone());
			cl.addNumPedidos();
		} catch (ClienteNaoCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
