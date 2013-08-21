package projetoip.dados.repositorios;
import java.util.Vector;

import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.excecoes.PedidoNaoCadastradoException;


public class RepositorioPedidoArray implements RepositorioPedido{
	private Pedido[]array;
	private int i;
	
	public RepositorioPedidoArray(){
		this.array= new Pedido[10000];
		this.i=0;
	}
	
	public void inserir(Pedido pedido) {
		array[i]=pedido;
		i++;
	}

	
	public Pedido procurar(String codigo) {
		Pedido pedido = null;
		for (int i = 0; i < this.i; i++) {
			if (array[i].getCodigo().equals(codigo)) {
				pedido = array[i];
			}
		}
		return pedido;
	}

	private int getIndice(String codigo) {
		boolean achou = false;
		String n;
		int i = 0;
		while (!achou && i < this.i) {
			n = array[i].getCodigo();
			if (n.equals(codigo)) {
				achou = true;
			} else {
				i++;
			}
		}
		return i;
	}
	
	public Pedido[] getArray() {
		return array;
	}

	public void setArray(Pedido[] array) {
		this.array = array;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void remover(String codigo) throws PedidoNaoCadastradoException {
		int i = getIndice(codigo);
		if (i == this.i) {
			throw new PedidoNaoCadastradoException();
		} else {
			this.i = this.i - 1;
			this.array[i] = this.array[this.i];
			this.array[this.i] = null;
		}
	}
	public boolean existe(String cpf) {
		int i = getIndice(cpf);
		return (i != this.i);
	}
	public void carregar(RepPedidoFile repositorio){
		 RepositorioPedidoVector pedido = repositorio.read();
		 Vector<Pedido> lista = pedido.getVec();
		 for(int i = 0; i<lista.size(); i++){
			 this.inserir(lista.get(i));
		 }
	}

	
	public int tamanho() {
		return this.i;
	}

	
	public Iterator<Pedido> procurarData(Data dataInicio, Data dataFim) {
		Vector<Pedido> vec = new Vector<Pedido>();
		
		for(int i = 0;i<this.i;i++){
			if(this.array[i].getData().getData().before(dataFim.getData())&&this.array[i].getData().getData().after(dataInicio.getData())){
				vec.add(this.array[i]);
			}
		}
		Iterator<Pedido> iterator = new Iterator<Pedido>(vec);
		return iterator;
	}

	
	
}
