package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        // Path where we want to create the new file and the name of the file with its extension

        String path="Files/test.properties";
        // we use FileOutputStream when we have to write the data to a file
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();
        properties.setProperty("Name","Anees");
        properties.store(fileOutputStream,"A new user has been added");


    }
}
