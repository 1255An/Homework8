package ru.skypro.homework8and9;

import java.util.Objects;

public class Book {
    private final String bookName;
    private int publicationYear;
    private final Author author;


    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;

    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return bookName + " : " + publicationYear + " : " + author;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return bookName.equals(book2.bookName) && publicationYear == book2.publicationYear && author.equals(book2.author);
    }

    @Override
    public int hashCode () {
        return Objects.hash(bookName, publicationYear, author.hashCode());
    }
}

