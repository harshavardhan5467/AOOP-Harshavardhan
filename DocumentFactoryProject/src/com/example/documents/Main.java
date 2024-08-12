package com.example.documents;

public class Main {
    public static void main(String[] args) {
        String docType = "pdf";  
        Document document = DocumentFactory.createDocument(docType);

        document.open();
        document.save("example_path");
        document.close();
    }
}