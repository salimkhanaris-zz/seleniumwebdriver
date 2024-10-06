package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDynamicDataIntoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file= new FileOutputStream("/Users/salimkhan/IdeaProjects/seleniumwebdriver/Excel/dynamicdata.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("DynamicData");

        Scanner sc= new Scanner(System.in);
        System.out.println("How many rows?");
        int noofrows=sc.nextInt();

        System.out.println("How many cells?");
        int noofCells=sc.nextInt();
        for (int row= 0; row<=noofrows;row++)
        {
            XSSFRow cr=sheet.createRow(row);

            for (int c=0; c<noofCells;c++)
            {
                XSSFCell cell=cr.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File Created");


    }
}
