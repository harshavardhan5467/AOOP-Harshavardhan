package com.example.documents;

	public class WordDocument implements Document {
	    public void open() {
	        System.out.println("Opening Word document.");
	    }

	    public void save(String path) {
	        System.out.println("Saving Word document to " + path + ".");
	    }

	    public void close() {
	        System.out.println("Closing Word document.");
	    }
	}


