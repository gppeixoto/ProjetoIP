package projetoip.dados.classesbase;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que representa a data
 * @author Guilherme Peixoto
 * @author Rafael Acevedo
 *
 */
public class Data implements Serializable {
	
	private static final long serialVersionUID = -5462289872762177255L;
	private Date data;
	private SimpleDateFormat dateformat;
	private String dateOut;
	
	/**
	 * Construtor que pega a data do sistema
	 */
	public Data(){
		this.data= new Date();
		String formato="dd/MM/yyyy";
		this.dateformat = new SimpleDateFormat(formato);
		this.dateOut=this.dateformat.format(this.data);
	}
	
	/**
	 * Construtor que recebe o dia, mês e ano quando pega o pedido do Excel
	 * @param dia
	 * @param mes
	 * @param ano
	 */
	public Data(int dia, int mes, int ano){
		this.data= new Date(ano-1900,mes-1,dia);
		String formato="dd/MM/yyyy";
		this.dateformat = new SimpleDateFormat(formato);
		this.dateOut=this.dateformat.format(this.data);
		System.out.println(dateOut);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
		this.dateOut=this.dateformat.format(this.data);
	}

	public SimpleDateFormat getDateformat() {
		return dateformat;
	}

	public void setDateformat(SimpleDateFormat dateformat) {
		this.dateformat = dateformat;
	}

	public String getDateOut() {
		return dateOut;
	}

	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public static void main(String[] args) {
		Data data = new Data(18,10,1960);
		
	}
}
