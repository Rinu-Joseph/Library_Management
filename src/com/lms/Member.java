package com.lms;

import java.util.ArrayList;
import java.util.List;

public class Member extends Library{
    private int  memberId;
    private String memberName;
    private List<Book> borrowedBooks;
    private int qnty;
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }
    Library lb=new Library();
    public Member()
    {
        Book obj1=new Book(101,"fairy","james",500,10,"story");
        Book obj2=new Book(102,"money","amban",1000,10,"finance");
        lb.addBook(obj1);
        lb.addBook(obj2);
    }


    public void borrowBook(int ISBN)
    {
        borrowedBooks=new ArrayList<>();
        for(Book book:lb.displayAvailableBooks())
        {
            if(book.getISBN()==ISBN)
            {
                borrowedBooks.add(book);
                System.out.println("succesfully borrowed book :"+ISBN);
                break;
            }
        }
    }
    public void returnBook(int ISBN)
    {
     for(Book book:borrowedBooks)
     {
         if(book.getISBN()==ISBN)
         {
             borrowedBooks.remove(book);
             System.out.println("succesfully removed book :"+ISBN);
             break;
         }
     }
    }

    public List<Book> displayBorrowedBook()
    {
        return borrowedBooks;
    }

}
