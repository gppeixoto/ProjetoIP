package projetoip.dados.repositorios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;


import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;

public class RepProdutosFile implements RepositorioProdutos,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 96158645010395315L;
	private RepositorioProdutosVector lista;

	public RepProdutosFile(){
		if(this.read() == null){	
			this.lista = new RepositorioProdutosVector();			
			this.write();			
		}else{
			this.lista = this.read();
		}
	}
	private void write(){		
		try {
			FileOutputStream fos = new FileOutputStream("src/produtos_file.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.lista);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public RepositorioProdutosVector read(){
		RepositorioProdutosVector rep  = null;
		try {			
			FileInputStream os = new FileInputStream("src/produtos_file.dat");
			ObjectInputStream input = new ObjectInputStream(os);

			rep= (RepositorioProdutosVector) input.readObject();
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
	public void inserir(Produto produto) throws ProdutoJaCadastradoException {
		this.lista = this.read();

		this.lista.inserir(produto);

		this.write();

	}
	public Produto procurar(String codigo)
			throws ProdutoNaoCadastradoException {
		return this.lista.procurar(codigo);
	}
	public Iterator<Produto> procurarNome(String nome)
			throws ProdutoNaoCadastradoException {
		return this.lista.procurarNome(nome);
	}
	
	public void remover(String codigo) throws ProdutoNaoCadastradoException {
		this.lista = this.read();
		this.lista.remover(codigo);
		this.write();
	}
	public boolean existe(String codigo){
		return this.lista.existe(codigo);
		
	}
	/*TESTE
	 * public static void main(String[] args) {
		RepProdutosFile r = new RepProdutosFile();
		Produto produto = new Produto("1","Pao","frances","U",new BigDecimal(10));
		Produto produto2 = new Produto("2","Pizza","pepperoni","8",new BigDecimal(30));
		try {
			r.inserir(produto2);
		} catch (ProdutoJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			r.remover("1");
		} catch (ProdutoNaoCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}TESTE
	}*/
}
