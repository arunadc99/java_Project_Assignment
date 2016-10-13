package java_project;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class head {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press- 1. Printing first 5,10,20 rows of the file " + "\n" +
                             "Press-2. Printing last 5,10,20 rows of the file " + "\n"+
                             "Press-3. Printing the row whose index number is provided by the user" + "\n"+
                             "Press-4. Calculating the sum of amount (One of the column will be Amount) (Location of amount column is not fixed)"+ "\n"+
                             "Press-5. Creating a csv file out of .xls file." + "\n");
		int num = sc.nextInt();
		
		if(num==1){
			Scanner sc1 = new Scanner(System.in);
			System.out.println(" first 5,10,20 rows of the file ");
			int Row = sc.nextInt();
			
			
		if(Row==5){
				readRows rr = new readRows();
				rr.rowcount5();
			    }else if(Row==10){
				readRow15 rr = new readRow15();
				rr.rowcount10();
				
				
			    }else{
				readRow20 rr = new readRow20();
				rr.rowcount20();
			    }
			    sc.close();
			
			
			
		}else if(num==2){
			
			 Scanner sc2 = new Scanner(System.in);
			 System.out.println(" last 5,10,20 rows of the file ");
			 int Row = sc.nextInt();
			 
			 if(Row==5){
				 
				readRowlast5 rr=new readRowlast5();
				rr.rowcountlast5();
				
			  }else if(Row==10){
				  
				readRowlast15 rr =new readRowlast15();
				rr.readRowlast15();
				
			   }else{
				   
				readRowlast20 rr=new readRowlast20();
				rr.readRowlast20();
			    }
			    sc2.close();
			 
		   }else if(num==3){
			
			     userInput ui = new userInput();
			     ui.userInputRow();
			
		    }else if(num==4){
		    	
			     SumOfNum sum = new SumOfNum();
			     sum.Sum();
		    }else{
		    	
			      XlstoCSV1 XC = new XlstoCSV1();
			      XC.callmethod();
		          }
		
		          System.out.println(num);
		           sc.close();
			
	}
 
}
