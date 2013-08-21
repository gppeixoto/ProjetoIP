package excel;


import java.util.Vector;

import projetoip.dados.classesbase.Cliente;
import projetoip.dados.classesbase.Data;
import projetoip.dados.classesbase.Pedido;
import projetoip.dados.classesbase.Produto;
import projetoip.dados.excecoes.ClienteNaoCadastradoException;
import projetoip.dados.excecoes.ProdutoNaoCadastradoException;
import projetoip.negocios.Servicos;
import projetoip.negocios.excecoes.pedido.QuantidadeIncompativelException;
import projetoip.negocios.excecoes.produto.CodigoInvalidoException;
import projetoip.negocios.excecoes.produto.CodigoVazioException;

public class LeituraPedidos {
	private ExcelWorkbook wb;
	private ExcelSheet sh;

	public LeituraPedidos(){
		try {
			this.wb=new ExcelWorkbook("Delivery.xls");
			this.sh= this.wb.getSheet("Pedidos");
		} catch (IOExcelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SheetNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void lerPedidos(Servicos servicos){
		
		boolean sucesso=true;
		try{
			for(int i = 1;i<14;i++){
				ExcelRow er = this.sh.getRow(i);
				String codigo,telefone,codigoProdutos,data;
				int quantidade;
				double valor;
				codigo=""+(int)er.getCell(0).getNumericCellValue();
				telefone = er.getCell(1).getStringCellValue();
				Cliente cliente = servicos.procurarCliente(telefone);
				quantidade = (int) er.getCell(2).getNumericCellValue();
				codigoProdutos = er.getCell(3).getStringCellValue();
				String[] codigos = codigoProdutos.split("-");
				Vector<Produto> vec = new Vector<Produto>();
				for(int j = 0;j<codigos.length;j++){
					vec.add(servicos.procurarProduto(codigos[i]));
				}
				data = er.getCell(4).getStringCellValue();
				data = data.substring(data.indexOf("(") + 1, data.indexOf(")"));
				String[]dias=data.split("/");
				int dia=Integer.parseInt(dias[0]);
				int mes=Integer.parseInt(dias[1]);
				int ano= Integer.parseInt(dias[3]);
				Data dataFim = new Data(dia, mes, ano);
				Pedido pedido= new Pedido(codigo,cliente,vec,quantidade,dataFim);
				servicos.adicionarPedido(pedido);
			}
		}catch(CellNumberFormatException e){
			//
		} catch (NotDefinedCellException e) {
			// TODO Auto-generated catch block
		} catch (NotDefinedRowException e) {
			// TODO Auto-generated catch block
		} catch (CellStringFormatException e) {
			// TODO Auto-generated catch block
		} catch (ClienteNaoCadastradoException e) {
			sucesso=false;
		} catch (ProdutoNaoCadastradoException e) {
			sucesso=false;
		} catch (CodigoInvalidoException e) {
			sucesso=false;
		} catch (CodigoVazioException e) {
			sucesso=false;
		} catch (QuantidadeIncompativelException e) {
			sucesso=false;
		}
	}
}
