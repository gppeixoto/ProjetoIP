package projetoip.dados.repositorios;

import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.excecoes.PedidoNaoCadastradoException;

public interface RepositorioPedido {
	void inserir(Pedido pedido);

	Pedido procurar(String codigo) throws PedidoNaoCadastradoException;

	void remover(String codigo) throws PedidoNaoCadastradoException;

	boolean existe(String codigo);
	
	Iterator<Pedido> procurarData(Data dataInicio,Data dataFim);

	int tamanho();
}
