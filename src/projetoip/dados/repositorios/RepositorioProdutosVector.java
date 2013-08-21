package projetoip.dados.repositorios;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Vector;

import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;

public class RepositorioProdutosVector implements RepositorioProdutos ,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8111040045371242368L;
	/**
	 * 
	 */
	
	private Vector<Produto> vec;
	private int indice;

	public RepositorioProdutosVector() {
		this.vec = new Vector<Produto>();
		this.indice = 0;
	}

	public void inserir(Produto produto) throws ProdutoJaCadastradoException {
		try{
			this.procurar(produto.getCodigo());
			throw new ProdutoJaCadastradoException();
		}catch(ProdutoNaoCadastradoException e){
			vec.add(produto);
			indice++;
		}
	}

	public Produto procurar(String codigo) throws ProdutoNaoCadastradoException {
		Produto produto = null;
		for (int i = 0; i < indice; i++) {
			if (this.vec.get(i).getCodigo().equals(codigo)) {
				produto = vec.get(i);
			}
		}
		if (produto==null) {
			throw new ProdutoNaoCadastradoException();
		} else {
			return produto;
		}

	}
	public Iterator<Produto> procurarNome(String nome) {
		Vector <Produto> aux = new Vector<Produto>();
		for(int i = 0;i<this.indice;i++){
			if(this.vec.get(i).getNome().contains(nome)){
				aux.add(this.vec.get(i));
			}
		}
		Iterator<Produto> iterator = new Iterator<Produto>(aux);
		return iterator;
	}

	public void remover(String codigo) throws ProdutoNaoCadastradoException {
		indice--;
		Produto produto;
		try {
			produto = procurar(codigo);
		} catch (ProdutoNaoCadastradoException e) {
			throw new ProdutoNaoCadastradoException();
		}
		vec.removeElement(produto);
	}


	/*
	 * public void atualizar(Produto produto) throws
	 * ProdutoNaoCadastradoException { int i = vec.indexOf(produto); vec.set(i,
	 * produto);
	 * 
	 * }
	 */
	public boolean existe(String codigo){
		boolean b = false;
		for (int i = 0; i < indice; i++) {
			if (this.vec.get(i).getCodigo().equals(codigo)) {
				b = true;
			}
		}
		return b;
	}
	public void carregar(RepProdutosFile rep) throws ProdutoJaCadastradoException{
		RepositorioProdutosVector pedido = rep.read();
		Vector<Produto> lista = pedido.getVec();
		for(int i = 0; i<lista.size(); i++){
			this.inserir(lista.get(i));
		}
	}

	public Vector<Produto> getVec() {
		return vec;
	}

	public int getIndice() {
		return indice;
	}
	

}
