package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book("Tolkien", "Hobbit"));
        library.addBook(new Book("author1", "title1"));
        library.addBook(new Book("author2", "title2"));
        library.addBook(new Book("author3", "title3"));

        library.addReader(new Reader("Jan Nowak", "Gdańsk"));
        library.addReader(new Reader("Łukasz Nowak", "Wrocław"));
        library.addReader(new Reader("Piotr Kowalski", "Warszawa"));
        library.addReader(new Reader("Robert Kowal", "Parczew"));


        System.out.println(library);
        Book result1 = library.findBook("Hobbit");
        System.out.println(result1);

        library.removeBook("Hobbit");

        result1 = library.findBook("Hobbit");
        System.out.println(result1);


        Reader result = library.findReader("Jan Nowak");
        System.out.println(result);
        library.removeReader("Łukasz Nowak");
        result = library.findReader("Łukasz Nowak");
        System.out.println(result);



    }
}

