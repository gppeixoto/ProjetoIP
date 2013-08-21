package projetoip.dados.repositorios;
import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;

public interface RepositorioProdutos {
	void inserir(Produto produto) throws ProdutoJaCadastradoException;

	Produto procurar(String codigo) throws ProdutoNaoCadastradoException;

	Iterator<Produto> procurarNome(String nome) throws ProdutoNaoCadastradoException;
	
	void remover(String codigo) throws ProdutoNaoCadastradoException;

	boolean existe(String codigo);
}
