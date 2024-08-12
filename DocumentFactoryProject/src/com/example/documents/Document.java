package com.example.documents;

public interface Document {
	void open();
    void save(String path);
    void close();
}

