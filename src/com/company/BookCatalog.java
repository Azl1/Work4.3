package com.company;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class BookCatalog {

    Scanner scanner = new Scanner(System.in);
    TreeMap<String, TreeSet<Book>> treeMapBook = new TreeMap<>();

    public void addBook(Book book){
        String input = scanner.nextLine();
        String[] parse = input.split(", ");
        String nameBook = parse[0];
        String bookAuthor = parse[1];
        int yearBook = Integer.parseInt(parse[2]);
        String bookGenre = parse[3];
        TreeSet<Book> treeSetBook = treeMapBook.get(bookGenre);
        treeMapBook.put(treeSetBook, new TreeSet<Book>(nameBook, bookAuthor, yearBook, bookGenre));
    }

    public void printGenres() {
        for (String str : treeMapBook.entrySet()) {
            System.out.println(str);
        }
    }

    public void printGenre(String genre){

    }

    public void printGenresAllBook(){

    }
}
