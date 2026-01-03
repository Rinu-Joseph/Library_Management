package com.lms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private List<Book> listBooks;
    private String libraryName;
    private String address;

    public List<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void addBook(Book book)
    {
        if(listBooks==null)
        {
            listBooks=new ArrayList<>();
        }
        listBooks.add(book);
    }
    public void removeBook(int ISBN)
    {
        for(Book book:listBooks)
        {
            if(book.getISBN()==ISBN) {
                listBooks.remove(book);
                System.out.println("SuccessFully removed Book" +ISBN);
                break;
            }
        }
    }
    public List<Book> searchByAuthor(String author)
    {
        ArrayList<Book> ab=new ArrayList<>();
        for(Book book:listBooks)
        {
            if(book.getAuthor().equalsIgnoreCase(author))
            {
              ab.add(book);
            }
        }
        return ab;
    }
    public List<Book> searchByGenre(String genre)
    {
        ArrayList<Book> gb=new ArrayList<>();
        for(Book book:listBooks)
        {
            if(book.getGenre().equalsIgnoreCase(genre))
            {
                gb.add(book);
            }
        }
        return gb;
    }
    public List<Book> displayAvailableBooks()
    {
        return listBooks;
    }

}
