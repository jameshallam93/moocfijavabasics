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
public class Book implements Comparable<Book>, Comparator<Book> {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " ("+ "recommended for " + this.age + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book book){
        return this.getAge() - book.getAge();
    }
    
    @Override
    public int compare(Book b1, Book b2){
        return b1.compareTo(b2);
    }
    
}
