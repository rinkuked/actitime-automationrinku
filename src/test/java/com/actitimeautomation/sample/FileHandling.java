package com.actitimeautomation.sample;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] arg) throws Exception {
        Workbook workbook = null;

        String filepath = "C:/Users/kedar/Documents/book11.xlsx";

        String extension = filepath.substring(filepath.indexOf(".") + 1);
        //access file
        FileInputStream ip = new FileInputStream(filepath);

        //based on extension of file access file
        if (extension.equals("xlsx")) {
            workbook = new XSSFWorkbook(ip);

        } else if (extension.equals("xlx")) {
            workbook = new HSSFWorkbook(ip);
        }

//get control of sheet
        Sheet sheet = workbook.getSheet("sheet1");


        //get total no od rows

        int totalrows = sheet.getPhysicalNumberOfRows();

        //get total coloums from 0 th row
        int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();


        for (int i = 1; i <= totalrows - 1; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j <= totalcolumns - 1; j++) {

                Cell cell = row.getCell(j);
                //check the type of cell


                CellType cellType = cell.getCellType();
                Object value = null;
//get value from cell based on type
                if (cellType.equals(cellType.NUMERIC)) {

                    value = cell.getNumericCellValue();
                } else if (cellType.equals(cellType.STRING)) {
                    value = cell.getStringCellValue();

                } else if (cellType.equals(cellType.BOOLEAN)) {
                    value = cell.getBooleanCellValue();

                } else {
                    value = "  ";
                }

                System.out.println(value);

            }
        }
    }
}
