package com.example.documents;

	public class PDFDocument implements Document {
	   
	    public void open() {
	        System.out.println("Opening PDF document.");
	    }

	    
	    public void save(String path) {
	        System.out.println("Saving PDF document to " + path + ".");
	    }

	    
	    public void close() {
	        System.out.println("Closing PDF document.");
	    }
	}


