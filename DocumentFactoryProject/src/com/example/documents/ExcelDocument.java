package com.example.documents;

public class ExcelDocument implements Document {
    
    public void open() {
        System.out.println("Opening Excel document.");
    }

    
    public void save(String path) {
        System.out.println("Saving Excel document to " + path + ".");
    }

    public void close() {
        System.out.println("Closing Excel document.");
    }
}

