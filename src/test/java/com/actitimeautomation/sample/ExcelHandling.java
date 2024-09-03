package com.actitimeautomation.sample;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelHandling {

    public Workbook getWorkBook(String filepath) throws IOException {
        Workbook workbook = null;
        try {
            String extension = filepath.substring(filepath.indexOf(".") + 1);
            System.out.println(extension);
            //access file
            FileInputStream ip = new FileInputStream(filepath);
            //based on extension of file access file
            if (extension.equals("xlsx")) {
                workbook = new XSSFWorkbook(ip);

            } else if (extension.equals("xlx")) {
                workbook = new HSSFWorkbook(ip);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return workbook;

    }

    //access sheets
    public Object[][] getExcelData(String filepath, String sheetName) throws IOException {
        Workbook workbook = getWorkBook(filepath);
//get control of sheet
        Sheet sheet = workbook.getSheet(sheetName);
        //GET total rows
        int totalRows = sheet.getPhysicalNumberOfRows();
        //get total colum from 0 th row
        int totalColum = sheet.getRow(0).getPhysicalNumberOfCells();

//two dimensional array
        Object[][] testData = new Object[totalRows - 1][totalColum];
        for (int i = 1; i <= totalColum - 1; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j <= totalColum - 1; j++) {
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


                testData[i - 1][j] = value;
                System.out.println(value + " ");
            }
            System.out.println();

        }
        System.out.println(testData);
//close workbook
        workbook.close();
        return testData;
    }

    public void writeExcelData(String filepath, String sheetName, Object[][]data ) throws IOException {

        Workbook workbook = getWorkBook(filepath);
        Sheet sheet;
        Row row;
        Cell cell;
        //check if sheet is already created
        //if its created then reuse it else create new with name
        if (workbook.getSheet(sheetName) != null)
        {
            sheet = workbook.getSheet(sheetName);
        }
        else{
            sheet = workbook.createSheet(sheetName);

        }
        //get the row lenght of data object
        int totalRowsInData = data.length;
        //get lenght column
        int totalColumData = data[0].length;
        //iterate through each row and colum and write into the excel file
        // w row = sheet.createRow(0);
        for (int i = 0; i <= totalRowsInData - 1; i++) {
            //get the access of each row
            //if row is already present reuse that row or creeate new row
            if (sheet.getRow(i) != null) {
                row = sheet.getRow(i);

            } else {
                row = sheet.createRow(i);
            }
            for (int j = 0; j <= totalColumData - 1; j++) {
                Object value = data[i][j];
//if cell is already created reuse it else create new cell
                if (row.getCell(j) != null) {
                    cell = row.getCell(j);
                } else {
                    cell = row.createCell(j);
                }
                //set value in cell
                cell.setCellValue(value.toString());
            }
        }


        FileOutputStream op = new FileOutputStream(filepath);
        workbook.write(op);

        workbook.close();
        op.close();
    }

    public static void main(String[] args) throws IOException {
        ExcelHandling ex = new ExcelHandling();
        String filePath = "C:/Users/kedar/Documents/book11.xlsx";
        Object[][] data = new Object[][]
                {
                        {"val1", "val2", "val3"},
                        {"val4", "val5", "val6"},
                        {"val7", "", "val8"},

                };

        ex.writeExcelData(filePath, "sam", data);
    }


}

