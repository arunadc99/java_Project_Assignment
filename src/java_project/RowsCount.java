package java_project;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
		
		public class RowsCount {


			public static void main(String[] args) throws IOException {
				FileInputStream fis = new FileInputStream(new File("C:\\Users\\a_ans\\Desktop\\test_data.xls"));
				HSSFWorkbook wb =new HSSFWorkbook(fis);
				HSSFSheet  sheet = wb.getSheetAt(0);
				FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
				
				for(Row row :sheet){
					for(Cell cell: row){
									
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
			