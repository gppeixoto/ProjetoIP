package excel;


public class Teste {
	public static void main(String[] args) {
		try{
			ExcelWorkbook workbook = new ExcelWorkbook("Delivery.xls");
			ExcelSheet sheet=workbook.getSheet("Produtos");
			ExcelRow row=sheet.getRow(6);
			ExcelCell cell=row.getCell(2);
			System.out.println(cell.getStringCellValue());
		}catch(Exception e){
			System.out.println("erro");
		}
	}
}
