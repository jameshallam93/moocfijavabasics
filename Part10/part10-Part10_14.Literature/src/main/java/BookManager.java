/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author james
 */
public class BookManager implements Comparator<Book> {
    
    private ArrayList<Book> books;
    private Comparator compare;

    public BookManager() {
        this.books = new ArrayList<>();
        

    }
    
    public void addBook(Book book){
        this.books.add(book);
    }
    
    public int noOfBooks(){
        return this.books.size();
    }
    
    public ArrayList<Book> returnBooks(){
        return this.books;
    }
    
    public void printBooks(){
        for (Book book: books){
            System.out.println(book.toString());
        }
    }
    @Override
    public int compare(Book b1, Book b2){
        return b1.compareTo(b2);
        
    }
    
}
