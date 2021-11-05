package ru.skypro.homework8and9;

import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
    public String getFirstNameAuthor (){
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor () {
        return this.lastNameAuthor;
    }

    @Override
    public String toString () {
        return firstNameAuthor + " " + lastNameAuthor ;
    }

    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } Author book2 = (Author) other;
        return firstNameAuthor.equals(book2.getFirstNameAuthor()) && lastNameAuthor.equals(book2.getLastNameAuthor());
    }

    @Override
    public int hashCode () {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }

}

