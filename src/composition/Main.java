package composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Effective Java","Joshua Bloch");
        Book b2 =  new Book("Thinking in Java","Hervert Schidlt");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);

        Library library = new Library(books);

        List<Book> bks = library.getTotalBooksInLibrary();
        for (Book bk :bks){
            System.out.println("Title: "+bk.title+" and "+"Author"+ bk.author);
        }


    }
}
