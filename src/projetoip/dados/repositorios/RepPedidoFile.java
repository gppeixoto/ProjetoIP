package projetoip.dados.repositorios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Vector;

import projetoip.dados.classesbase.Cliente;
import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Endereco;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.PedidoNaoCadastradoException;

public class RepPedidoFile implements RepositorioPedido,Serializable{
	private RepositorioPedidoVector lista;
	
	public RepPedidoFile(){
		if(this.read() == null){	
			this.lista = new RepositorioPedidoVector();			
			this.write();			
		}else{
			this.lista = this.read();
		}
	}
	private void write(){		
		try {
			FileOutputStream fos = new FileOutputStream("src/pedidos_file.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.lista);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public RepositorioPedidoVector read(){
		RepositorioPedidoVector rep  = null;
		try {			
			FileInputStream os = new FileInputStream("src/pedidos_file.dat");
			ObjectInputStream input = new ObjectInputStream(os);

			rep= (RepositorioPedidoVector) input.readObject();
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
	
	public void inserir(Pedido pedido) {
		this.lista = this.read();

		this.lista.inserir(pedido);

		this.write();
		
	}
	
	public Pedido procurar(String codigo) throws PedidoNaoCadastradoException {
		return this.lista.procurar(codigo);
	}
	
	public void remover(String codigo) throws PedidoNaoCadastradoException {
		this.lista = this.read();
		this.lista.remover(codigo);
		this.write();
		
	}
	
	public boolean existe(String codigo) {
		return this.lista.existe(codigo);
	}
	public RepositorioPedidoVector getLista() {
		return lista;
	}
	@Override
	public int tamanho() {
		return this.lista.tamanho();
	}
	public Iterator<Pedido> procurarData(Data dataInicio, Data dataFim) {
		Vector<Pedido> vec = new Vector<Pedido>();
		
		for(int i = 0;i<this.lista.getVec().size();i++){
			if(this.lista.getVec().get(i).getData().getData().before(dataFim.getData())&&this.lista.getVec().get(i).getData().getData().after(dataInicio.getData())){
				vec.add(this.lista.getVec().get(i));
			}
		}
		Iterator<Pedido> iterator = new Iterator<Pedido>(vec);
		return iterator;
	}
	/*TESTE
	 * public static void main(String[] args) {
		RepPedidoFile r = new RepPedidoFile();
		Cliente cliente = new Cliente("10150035403","34678778","Rafael",new Endereco("Rua","3650","apt 2301","Boa viagem","Recife"),"obs");
		Produto produto = new Produto("1","Pao","Frances","U",new BigDecimal(0.5));
		Produto[] arrayProd={produto};
		Data data= new Data();
		//r.inserir(new Pedido("11",cliente,arrayProd,data));
		//System.out.println(r.getLista().getVec().get(0).getCodigo());
		try {
			r.remover("11");
		} catch (PedidoNaoCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TESTE
	}*/
	
}
