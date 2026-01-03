import com.lms.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book obj1=new Book(101,"fairy","james",500,10,"story");
        Book obj2=new Book(102,"money","amban",1000,10,"finance");
        Library lb=new Library();
        lb.setLibraryName("Gandhi");
        lb.setAddress("Cochi");
        lb.addBook(obj1);
        lb.addBook(obj2);
        SerializationHandler sh=new SerializationHandler();
        sh.serializeLibrary(lb,"Library.txt");

 Library dt1=sh.deserializeLibrary("Library.txt");
 System.out.println(dt1.displayAvailableBooks());
 String name="amban";
 List<Book> b=lb.searchByAuthor(name);
 if(b.size()<=0)
 {
     throw new BookNotFoundException("The book is not available");

 }
 Member mb=new Member();
 mb.setMemberId(2);
 mb.setMemberName("riya");
 mb.setQnty(10);
int isbn=102;
for(Book book: lb.displayAvailableBooks())
{
    if(book.getISBN()==isbn)
    {
        if(book.getAvailability()>= mb.getQnty())
        {
            mb.borrowBook(isbn);
        }
        else {
            throw new NotEnoughBooksException("not have that much quantity");
        }


    }
}
    }
}