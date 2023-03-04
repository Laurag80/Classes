package com.syntax.class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExcelReadDemo1 {
    public static void main(String[] args) throws IOException {

        String path="Files/Book1.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook xssWorkbook=new  XSSFWorkbook(fileInputStream);

        XSSFSheet sheet1=xssWorkbook.getSheet("Sheet1");

        Row raw=sheet1.getRow(1);
        Cell cll=raw.getCell(1);
        System.out.println(cll);

    }
}
