package com.lms;

import java.io.Serializable;

public class Book implements Serializable {
    private int ISBN;
    private String title;
    private String Author;
    private int price;
    private int availability;
    private String genre;

    public Book(int ISBN, String title, String author, int price, int availability, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        Author = author;
        this.price = price;
        this.availability = availability;
        this.genre = genre;
    }

    public  Book()
{

}
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                ", genre='" + genre + '\'' +
                '}';
    }
}
