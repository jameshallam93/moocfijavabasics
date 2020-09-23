package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if (name == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (name.isEmpty() || name.length()>40){
            throw new IllegalArgumentException("Name must be less than 40 characters");
        }

        
        
        try{this.name = name;}
        catch(Exception e){
            System.out.println("Error:" + e.getMessage());
        }
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
