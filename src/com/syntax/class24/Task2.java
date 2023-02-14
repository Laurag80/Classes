package com.syntax.class24;

public class Task2 {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract. Create 3 subclasses:
    JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
    Microsoft word to be installed etc
     */
    abstract class File {
        abstract void open();

        public void edit() {
            System.out.println("Editing the file...");
        }

        public void close() {
            System.out.println("Closing the file...");
        }
    }

    class JavaFile extends File {
        public void open() {
            System.out.println("Opening .java file with Notepad++ or Sublime Text");
        }
    }

    class WordFile extends File {
        public void open() {
            System.out.println("Opening .doc file with Microsoft Word");
        }
    }

    class PdfFile extends File {
        public void open() {
            System.out.println("Opening .pdf file with Adobe Acrobat Reader");
        }
    }
}