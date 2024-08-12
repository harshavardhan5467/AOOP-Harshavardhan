package com.example.documents;

public class DocumentFactory {
    public static Document createDocument(String docType) {
        switch (docType.toLowerCase()) {
            case "word":
                return new WordDocument();
            case "pdf":
                return new PDFDocument();
            case "excel":
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + docType);
        }
    }
}