package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

@Test
    public void read_from_excel_file() throws IOException {
    String path = "SampleData.xlsx";
// to read from excel we need to load FileInput Stream
    FileInputStream fileInputStream = new FileInputStream(path);

    //workbook>sheet>row>cell

    //<1 Create a workbook>
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
    //<2> WQe need to get specific sheet from currently opened workbook
    XSSFSheet sheet =workbook.getSheet("Employee");
    //<3> Select row AND cell
    // Print out marys cell
    //Index start from 0
    System.out.println(sheet.getRow(1).getCell(0));

    //print out Developer
    System.out.println(sheet.getRow(3).getCell(2));

    // return the count of used cells only
    //starts counting from 1
    int usedRows =sheet.getPhysicalNumberOfRows();
    System.out.println(usedRows);
    //return the number from top cell


}
}
