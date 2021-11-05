package ru.skypro.homework8and9;


public class Main {

    public static void main(String[] args) {
        Author authorBook1 = new Author("Louisa ", "Alcott");
        Book book1 = new Book("Little Women", 1868, authorBook1);
        // System.out.println("Name of the first book is " + book1.getBookName());
        // System.out.println("The first book was published in " + book1.getPublicationYear() + " year");
        //System.out.println("The author of the first book is " + book1.getAuthor().getFirstNameAuthor() + book1.getAuthor().getLastNameAuthor());
        // book1.setPublicationYear(1869);
        //System.out.println("The first book was published in " + book1.getPublicationYear() + " year");
        System.out.println(book1);
        System.out.println("Hash code of Book1: " + book1.hashCode());



        Author authorBook2 = new Author("Harper ", "Lee");
        Book book2 = new Book("To kill a mockingbird", 1960, authorBook2);

//        System.out.println("Name of the second book is " + book2.getBookName());
//        System.out.println("The second book was published in " + book2.getPublicationYear() + " year");
//        System.out.println("The author of the first book is " + book2.getAuthor().getFirstNameAuthor() + book2.getAuthor().getLastNameAuthor());
//        book2.setPublicationYear(1980);
//        System.out.println("The second book was published in " + book2.getPublicationYear() + " year");
        System.out.println(book2);
        System.out.println("Book1 equal to Book2: " + book1.equals(book2));
        System.out.println("Hash code of Book2: " + book2.hashCode());
        System.out.println();
//
//
//        Book[] library = new Book[5];
//        newBook(library, book1);
//        newBook(library, book2);
//
//    }
//
//    public static Book[] newBook(Book[] library, Book book) {
//        for (int i = 0; i < library.length; i++) {
//            if (library[i] == null) {
//                library[i] = book;
//                System.out.println(book.getAuthor().getFirstNameAuthor() + book.getAuthor().getLastNameAuthor() + ": " + book.getBookName() + ": " + book.getPublicationYear());
//                break;
//            }
//        }
//        return library;
    }
}

