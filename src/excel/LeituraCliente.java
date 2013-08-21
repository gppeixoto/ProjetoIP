package excel;

import java.io.Serializable;

import projetoip.dados.classesbase.Cliente;
import projetoip.dados.classesbase.Endereco;
import projetoip.dados.excecoes.ClienteJaCadastradoException;
import projetoip.negocios.Servicos;
import projetoip.negocios.excecoes.cliente.CPFInvalidoException;
import projetoip.negocios.excecoes.cliente.TelefoneInvalidoException;
import projetoip.negocios.excecoes.endereco.BairroVazioException;
import projetoip.negocios.excecoes.endereco.CidadeVaziaException;
import projetoip.negocios.excecoes.endereco.LogradouroVazioException;

public class LeituraCliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7115200805146760348L;
	private ExcelWorkbook wb;
	private ExcelSheet sh;
	public LeituraCliente() {
		try {
			this.wb= new ExcelWorkbook("Delivery.xls");
			this.sh= this.wb.getSheet("Clientes");
		} catch (IOExcelException e) {
			e.printStackTrace();
		} catch (SheetNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void lerClientes(Servicos servicos) {
		boolean sucesso=true;
		for(int i = 0;i<32;i++){
			ExcelRow er = null;
			try {
				er = sh.getRow(i);
				String nome,cpf,logradouro;

				nome = er.getCell(0).getStringCellValue();
				cpf=er.getCell(1).getStringCellValue();
				logradouro=er.getCell(2).getStringCellValue();

				double num=0;
				String numero;
				try{
					num = er.getCell(3).getNumericCellValue();
					numero=Double.toString(num);
				}catch(CellNumberFormatException e){
					numero="";
				}
				String complemento="";
				try{
					complemento=er.getCell(4).getStringCellValue();
				}catch (CellStringFormatException e) {
					//
				}catch(NotDefinedCellException e){
					//
				}
				String bairro = null;
				String cidade = null;
				String telefone = null;

				bairro = er.getCell(5).getStringCellValue();
				cidade = er.getCell(6).getStringCellValue();
				telefone = er.getCell(7).getStringCellValue();

				String obs="";
				try{
					obs=er.getCell(8).getStringCellValue();
				}catch(CellStringFormatException e){
					//
				}catch(NotDefinedCellException e){
					//
				}
				Cliente cliente = new Cliente(cpf,telefone,nome,new Endereco(logradouro,numero,complemento,bairro,cidade),obs);

				servicos.adicionarCliente(cliente);
				System.out.println("cpf:"+cliente.getCpf());
			} catch (NotDefinedRowException e2) {
				// TODO Auto-generated catch block

			} catch (ClienteJaCadastradoException e) {
				// TODO Auto-generated catch block
				
				sucesso = false;
			} catch (CPFInvalidoException e) {
				// TODO Auto-generated catch block
				
				sucesso=false;
			} catch (TelefoneInvalidoException e) {
				// TODO Auto-generated catch block
				
				sucesso = false;
			} catch (CellStringFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotDefinedCellException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BairroVazioException e) {
				// TODO Auto-generated catch block
				
				sucesso=false;
			} catch (CidadeVaziaException e) {
				// TODO Auto-generated catch block
				
				sucesso=false;
			} catch (LogradouroVazioException e) {
				// TODO Auto-generated catch block
				sucesso=false;
			}//end catches
		}//end for
	}//end method
}
