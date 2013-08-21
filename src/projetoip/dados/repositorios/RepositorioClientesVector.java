package projetoip.dados.repositorios;
import java.io.Serializable;
import java.util.Vector;

import projetoip.dados.classesbase.Cliente;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;

public class RepositorioClientesVector implements RepositorioClientes,Serializable {
	/**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 6555602642017020886L;
	/**
	 * 
	 */

	private Vector<Cliente> vec;
	private int indice;

	public RepositorioClientesVector() {
		this.vec = new Vector<Cliente>();
		this.indice = 0;
	}

	public void inserir(Cliente cliente) throws ClienteJaCadastradoException {
		try{
			procurar(cliente.getTelefone());
			throw new ClienteJaCadastradoException();
		}catch(ClienteNaoCadastradoException e){
			if(existe(cliente.getCpf())){
				throw new ClienteJaCadastradoException();
			}else{
				vec.add(cliente);
				indice++;
			}
		}


	}

	public Cliente procurar(String telefone) throws ClienteNaoCadastradoException {
		Cliente cliente = null;
		for (int i = 0; i < indice; i++) {
			if (this.vec.get(i).getTelefone().equals(telefone)) {
				cliente = vec.get(i);
			}
		}
		if (cliente==null) {
			throw new ClienteNaoCadastradoException();
		} else {
			return cliente;
		}
	}
	public Iterator<Cliente> procurarNome(String nome){
		Vector<Cliente> aux= new Vector<Cliente>();
		for(int i = 0;i<indice;i++){
			if(this.vec.get(i).getNome().contains(nome)){
				aux.add(vec.elementAt(i));
			}
		}
		Iterator<Cliente>iterator= new Iterator<Cliente>(aux);
		return iterator;
	}

	public void remover(String telefone) throws ClienteNaoCadastradoException {
		Cliente cliente = procurar(telefone);
		vec.removeElement(cliente);
		indice--;
	}

	/*
	 * public void atualizar(Cliente cliente) throws
	 * ClienteNaoCadastradoException { int i = vec.indexOf(cliente); vec.set(i,
	 * cliente); }
	 */

	public boolean existe(String cpf) {
		boolean b = false;
		for (int i = 0; i < indice; i++) {
			if (this.vec.get(i).getCpf().equals(cpf)) {
				b = true;
			}
		}
		return b;
	}
	public void carregar(RepClientesFile rep) throws ClienteJaCadastradoException{
		RepositorioClientesVector pedido = rep.read();
		Vector<Cliente> lista = pedido.getVec();
		for(int i = 0; i<lista.size(); i++){
			this.inserir(lista.get(i));
		}
	}

	public Vector<Cliente> getVec() {
		return vec;
	}

	public int getIndice() {
		return indice;
	}

	@Override
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
