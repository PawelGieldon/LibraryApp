package com.company;

public class Book {
    private String author, title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return " Autor: " + author + " |" + " Tytuł "  +title;
    }
}
