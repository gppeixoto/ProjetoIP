package projetoip.negocios.verificacoes;

import java.math.BigDecimal;

import projetoip.dados.classesbase.Produto;
import projetoip.negocios.excecoes.produto.CodigoInvalidoException;
import projetoip.negocios.excecoes.produto.ValorInvalidoException;

public class VerificacaoProduto {
	private Produto produto;
	
	public VerificacaoProduto(Produto produto){
		this.produto=produto;
	}
	
	/**
	 *  Verifica se um produto é valido
	 * @return true se estiver tudo certo
	 * @throws CodigoInvalidoException 
	 * @throws ValorInvalidoException 
	 */
	public boolean verificar() throws CodigoInvalidoException, ValorInvalidoException{
		try{
			Double.parseDouble(this.produto.getCodigo());
		}catch(NumberFormatException e ){
			throw new CodigoInvalidoException();
		}
		 if(!(this.produto.getValor().doubleValue()>0)){
			throw new ValorInvalidoException(); 
		}
		else{
			return true;
		}
	}
	/*public static void main(String[] args) {
		Produto produto = new Produto("11","Pao","frances","U",new BigDecimal(10));
		VerificacaoProduto v = new VerificacaoProduto(produto);
		try {
			System.out.println(v.verificar());
		} catch (CodigoInvalidoException | ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
}
