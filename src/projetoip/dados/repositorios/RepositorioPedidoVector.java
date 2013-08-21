package projetoip.dados.repositorios;

import java.io.Serializable;
import java.util.Vector;

import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.excecoes.PedidoNaoCadastradoException;


public class RepositorioPedidoVector implements RepositorioPedido,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 630621671551568386L;
	/**
	 * 
	 */
	
	private Vector<Pedido>vec;
	private int indice;
	
	public RepositorioPedidoVector(){
		this.vec= new Vector<Pedido>();
		this.indice=0;
	}
	
	public void inserir(Pedido pedido) {
		vec.add(pedido);
		indice++;
	}

	
	public Pedido procurar(String codigo) throws PedidoNaoCadastradoException {
		Pedido pedido = null;
		for (int i = 0; i < indice; i++) {
			if (this.vec.get(i).getCodigo().equals(codigo)) {
				pedido = vec.get(i);
			}
		}
		if(pedido==null){
			throw new PedidoNaoCadastradoException();
		}else{
			return pedido;
		}
	}

	
	public void remover(String codigo) throws PedidoNaoCadastradoException {
		indice--;
		Pedido pedido = procurar(codigo);
		vec.removeElement(pedido);
		
	}

	@Override
	public boolean existe(String codigo) {
		boolean b = false;
		for (int i = 0; i < indice; i++) {
			if (this.vec.get(i).getCodigo().equals(codigo)) {
				b = true;
			}
		}
		return b;
	}
	public void carregar(RepPedidoFile rep){
		RepositorioPedidoVector pedido = rep.read();
		Vector<Pedido> lista = pedido.getVec();
		for(int i = 0; i<lista.size(); i++){
			this.inserir(lista.get(i));
		}
	}

	public Vector<Pedido> getVec() {
		return vec;
	}

	public int getIndice() {
		return indice;
	}

	@Override
	public int tamanho() {
		return this.indice;
	}

	@Override
	public Iterator<Pedido> procurarData(Data dataInicio, Data dataFim) {
		Vector<Pedido> vec = new Vector<Pedido>();
		
		for(int i = 0;i<this.vec.size();i++){
			if(this.vec.get(i).getData().getData().before(dataFim.getData())&&this.vec.get(i).getData().getData().after(dataInicio.getData())){
				vec.add(this.vec.get(i));
			}
		}
		Iterator<Pedido> iterator = new Iterator<Pedido>(vec);
		return iterator;
	}
	
	
	/*teste
	 * public static void main(String[] args) {
		RepositorioPedidoVector r = new RepositorioPedidoVector();
		
	}*/
	
}
