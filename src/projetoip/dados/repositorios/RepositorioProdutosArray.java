package projetoip.dados.repositorios;
import java.util.Vector;

import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;

public class RepositorioProdutosArray implements RepositorioProdutos {
	private Produto[] array;
	private int indice;

	public RepositorioProdutosArray() {
		this.array = new Produto[10000];
		this.indice = 0;
	}

	public void inserir(Produto produto) throws ProdutoJaCadastradoException {
		int i = getIndice(produto.getCodigo());
		if (i == this.indice) {
			this.array[this.indice] = produto;
			this.indice++;
		} else {
			throw new ProdutoJaCadastradoException();
		}

	}

	public Produto procurar(String codigo) throws ProdutoNaoCadastradoException {
		Produto produto = null;
		for (int i = 0; i < indice; i++) {
			if (array[i].getCodigo().equals(codigo)) {
				produto = array[i];
			}
		}
		if (produto==(null)) {
			throw new ProdutoNaoCadastradoException();
		} else {
			return produto;
		}
	}
	public Iterator<Produto> procurarNome(String nome)throws ProdutoNaoCadastradoException{
		Vector<Produto> aux= new Vector<Produto>();
		boolean achou=false;
		for(int i = 0;i<indice;i++){
			if(array[i].getNome().contains(nome)){
				aux.add(array[i]);
			}
		}
		if(!achou){
			throw new ProdutoNaoCadastradoException();
		}
		Iterator<Produto> iterator = new Iterator<Produto>(aux);
		return iterator;
	}

	public void remover(String codigo) throws ProdutoNaoCadastradoException {
		int i = getIndice(codigo);
		if (i == this.indice) {
			throw new ProdutoNaoCadastradoException();
		} else {
			this.indice = this.indice - 1;
			this.array[i] = this.array[this.indice];
			this.array[this.indice] = null;
		}

	}

	private int getIndice(String codigo) {
		boolean achou = false;
		String n;
		int i = 0;
		while (!achou && i < this.indice) {
			n = array[i].getCodigo();
			if (n.equals(codigo)) {
				achou = true;
			} else {
				i++;
			}
		}
		return i;
	}
	public boolean existe(String codigo) {
		int i = getIndice(codigo);
		return (i != this.indice);
	}
	public void carregar(RepProdutosFile rep) throws ProdutoJaCadastradoException{
		RepositorioProdutosVector pedido = rep.read();
		Vector<Produto> lista = pedido.getVec();
		for(int i = 0; i<lista.size(); i++){
			this.inserir(lista.get(i));
		}
	}


	public Produto[] getArray() {
		return array;
	}

	public void setArray(Produto[] array) {
		this.array = array;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	
	

}
