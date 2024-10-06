package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDatFromExcel {
    public static void main(String[] args) throws IOException {

        FileInputStream read= new FileInputStream("/Users/salimkhan/IdeaProjects/seleniumwebdriver/Excel/data.xlsx");
        //The above has MacOS path
        XSSFWorkbook workbook= new XSSFWorkbook(read);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int totalRows=sheet.getLastRowNum();
        int totalcells=sheet.getRow(1).getLastCellNum();

        System.out.println("Number of rows: "+totalRows);
        System.out.println("Number of cells: "+totalcells);

        for (int i=0; i<=totalRows; i++)
        {
            XSSFRow currentRow = sheet.getRow(i);
            for (int j=0;j<totalcells;j++) // Cell size starts counting from 1 but java will start from 0
            {
                XSSFCell currentCell = currentRow.getCell(j);
                System.out.print(currentCell.toString()+" \t");
            }
            System.out.println();
        }
        workbook.close(); //Workbook should be closed after operations as it takes up memory
        //Close the file now
        read.close();

    }
}
