package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {

        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("name","Laura");
        row1.put("age","30");
        row1.put("City","San Ramon");
        row1.put("salary","120000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("name","Sam");
        row2.put("age","60");
        row2.put("City","Huston");
        row2.put("salary","125000");

        LinkedHashMap<String,String> row3=new LinkedHashMap<>();
        row3.put("name","Fayed");
        row3.put("age","45");
        row3.put("City","Alexandria");
        row3.put("salary","129000");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);
    }
}
