/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class UserInterface {
    
    private Scanner scanner;
    private BookManager collection;


    public UserInterface(Scanner scanner, BookManager collection) {
        this.scanner = scanner;
        this.collection = collection;
    }
    
    public ArrayList<Book> returnSorted(ArrayList<Book> list){
        
        ArrayList<Book> toSort = list;
        
        toSort.sort(Comparator.comparing(Book::getAge).thenComparing(Book::getName));
        
        return toSort;
    }
    
    
    public void start(){
        while (true){
            
            System.out.println("Input the name of the book,empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            collection.addBook(new Book(name, age));
        }
        
        ArrayList<Book> sortedBooks = returnSorted(this.collection.returnBooks());

                
                

        
        System.out.println(collection.noOfBooks() + " books in total.");
        
        sortedBooks.stream()
                .forEach(book -> System.out.println(book.toString()));
    }
}
