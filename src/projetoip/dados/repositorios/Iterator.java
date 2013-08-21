package projetoip.dados.repositorios;

import java.util.Vector;

public class Iterator<T> implements java.util.Iterator<T>{
	private Vector<T> iterator;
	private int indice;
	
	public Iterator(Vector<T> iterator){
		this.iterator=iterator;
		this.indice=0;
	}
	

	
	public boolean hasNext() {
		if(this.indice==iterator.size()){
			return false;
		}
		else{
			return true;
		}
	}

	public T next() {
		T retorno=iterator.get(indice);
		indice++;
		return retorno;
	}

	
	public void remove() {
		iterator.removeElementAt(indice);
	}


	
	public Vector<T> getIterator() {
		return iterator;
	}



	public void setIterator(Vector<T> iterator) {
		this.iterator = iterator;
	}



	public int getIndice() {
		return indice;
	}



	public void setIndice(int indice) {
		this.indice = indice;
	}
	
}
