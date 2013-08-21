package projetoip.dados.repositorios;
import projetoip.dados.classesbase.Cliente;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;

public interface RepositorioClientes {
	void inserir(Cliente cliente) throws ClienteJaCadastradoException;

	Cliente procurar(String telefone) throws ClienteNaoCadastradoException;

	Iterator<Cliente> procurarNome(String nome) throws ClienteNaoCadastradoException;
	
	void remover(String telefone) throws ClienteNaoCadastradoException;

	boolean existe(String telefone);
	
	void addNumPedidos(Cliente cliente);
}
