package day40;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataIntoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file= new FileOutputStream("/Users/salimkhan/IdeaProjects/seleniumwebdriver/Excel/data12.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sheet1");
        XSSFRow row1=sheet.createRow(0);
        row1.createCell(0).setCellValue("welcome");
        row1.createCell(1).setCellValue(1234);
        row1.createCell(2).setCellValue(true);
        row1.createCell(3).setCellValue("welcome");

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File Created");


    }
}
