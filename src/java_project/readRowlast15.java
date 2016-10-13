package java_project;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class readRowlast15 {


		public static void readRowlast15()  throws Exception {
			File excel=new File("C:\\Users\\a_ans\\Desktop\\test_data.xls");
			FileInputStream fis = new FileInputStream(excel);
			 HSSFWorkbook wb   =  new   HSSFWorkbook(fis);
			 HSSFSheet sheet       =   wb.getSheetAt(0);
			 FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
			 
			
			 for(int i =sheet.getLastRowNum();i>sheet.getLastRowNum()-15;i--){
				 Row row=sheet.getRow(i);
				 for(int j=0;j<row.getLastCellNum();j++){			 
					Cell cell= row.getCell(j);
					
			switch(fe.evaluateInCell(cell).getCellType())
			
					{
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() +"\t\t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue()+"\t\t");
						
							
						
					}
				}
				System.out.println();

			 }
		}
}

		
