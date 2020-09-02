import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();  
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title:");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name, pages, pubYear);
            books.add(book);
            
            
        }
        System.out.println("What information will be printed?");
        String instructions = scanner.nextLine();
        if (instructions.equals("everything")){
            for(Book book: books){
                System.out.println(book);
                
            }
            
        }
        if (instructions.equals("name")){
            for(Book book:books){
                String namex = book.getName();
                System.out.println(namex);
            }
        }
        

    }
}
