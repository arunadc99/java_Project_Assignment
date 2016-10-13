package java_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class SumOfNum {

	public static Row row;

	public static void Sum() throws Exception {
		File excel=new File("C:\\Users\\a_ans\\Desktop\\test_data.xls");
		FileInputStream fis = new FileInputStream(excel);
		 HSSFWorkbook wb   =  new   HSSFWorkbook(fis);
		 HSSFSheet sheet       =   wb.getSheetAt(0);
		
		 FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
		
		Cell cell=null;
		
				 row = sheet.createRow(29); 
			        cell = row.createCell(2); 
			        
			        cell.setCellFormula("SUM(C1:C28)"); 
			      
			        switch(fe.evaluateInCell(cell).getCellType())
				{
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() +"\t\t");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t\t");
					break;
					 case Cell.CELL_TYPE_FORMULA	:
				  {  
					     // Evaluting cell  
					      CellValue c=fe.evaluate(cell);  
					     System.out.println(c.getNumberValue());  
					    }  
	
				}
			   // System.out.print("  "); 
			    
			}

		
		
			 }
			 
		 





		 
		 
		 
		

