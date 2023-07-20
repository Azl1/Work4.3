package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        BookCatalog bookCatalog = new BookCatalog();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1) Введите книгу и добавьте жанр (из консоли);\n" +
                    "2) Вывод на экран всех доступных жанров в порядке возрастания;\n" +
                    "3) Вывод на экран всех книг в конкретном жанре;\n" +
                    "3) Вывод на экран в порядке возрастания всех жанров и всех книг, что в них содержатся, в алфавитном порядке.\n" +
                    "0) Выход");
            String input = scanner.nextLine();
            if(input.equals("0")){
                break;
            }
            switch (input){
                case ("1"):
                    System.out.println("Введите данные по книге: название, автор, год, жанр");
            //       String str = scanner.nextLine();
                bookCatalog.addBook();
                case ("2"):
                    bookCatalog.printGenres();
                case ("3"):
                    bookCatalog.printGenre();
                case ("0"):
                    bookCatalog.printGenresAllBook();
            }
        }
    }
}
