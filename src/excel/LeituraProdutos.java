package excel;

import java.io.Serializable;
import java.math.BigDecimal;

import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ProdutoJaCadastradoException;
import projetoip.negocios.Servicos;
import projetoip.negocios.excecoes.produto.CodigoInvalidoException;
import projetoip.negocios.excecoes.produto.ValorInvalidoException;

public class LeituraProdutos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6214736196700954623L;
	private ExcelWorkbook wb;
	private ExcelSheet sh;
	public LeituraProdutos() {
		try {
			this.wb= new ExcelWorkbook("Delivery.xls");
			this.sh= this.wb.getSheet("Produtos");
		} catch (IOExcelException e) {
			e.printStackTrace();
		} catch (SheetNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void lerProdutos(Servicos servicos){
		boolean sucesso=true;
		for(int i = 0;i<32;i++){
			ExcelRow er = null;
			try{
				er=sh.getRow(i);
				double code;
				String nome;
				String tamanho;
				String descricao="";
				double val;
				nome=er.getCell(1).getStringCellValue();
				code=(int)er.getCell(0).getNumericCellValue();
				String codigo=Integer.toString((int) code);
				tamanho=er.getCell(2).getStringCellValue();
				try{
					descricao=er.getCell(3).getStringCellValue();
				}catch(CellStringFormatException e){
					//
				}catch(NotDefinedCellException e){
					//
				}
				val = er.getCell(4).getNumericCellValue();
				BigDecimal valor = new BigDecimal(val);
				Produto produto = new Produto (codigo, nome,descricao,tamanho,valor);
				servicos.adicionarProduto(produto);
				System.out.println("codigo:"+produto.getCodigo());
			}catch(CellNumberFormatException e){
				//
			}catch(NotDefinedRowException e){
				//
			} catch (CodigoInvalidoException e) {
				sucesso=false;
			} catch (ValorInvalidoException e) {
				// TODO Auto-generated catch block
				sucesso=false;
			} catch (ProdutoJaCadastradoException e) {
				System.out.println("ja cadastrou");
				sucesso=false;
			} catch (NotDefinedCellException e) {
				// TODO Auto-generated catch block
			} catch (CellStringFormatException e) {
				// TODO Auto-generated catch block
			}
		}//end for
	}//end method
	
	/*public static void main(String[] args) {
		LeituraProdutos l = new LeituraProdutos();
		l.lerProdutos(new Servicos());
	}*/
}
