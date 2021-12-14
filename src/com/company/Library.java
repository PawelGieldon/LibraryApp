package com.company;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;
    private ArrayList<Reader> readerList;

    Library() {
        bookList = new ArrayList<>();
        readerList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void addReader(Reader reader) {
        readerList.add(reader);
    }

    public Book findBook(String title) {
        for(Book book: bookList){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findBooks(String title){
        ArrayList<Book> result = new ArrayList();
        for(Book book: bookList){
            if(book.getTitle().equals(title)){
                result.add(book);

            }
        }

        return null;
    }


    public Reader findReader(String name){
        for(Reader reader: readerList){
            if(reader.getName().equals(name)){
                return reader;
            }
        }
        return null;
    }

    public void removeBook(String title) {

        bookList.removeIf(book -> book.getTitle().equals(title));

    }

    public void removeReader(String name){
        readerList.removeIf(reader -> reader.getName().equals(name));
    }

    public String toString(){
        return "Lista ksiązek:" + bookList
                + " " + " Czytelnicy " + readerList
                ;

    }


}