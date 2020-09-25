

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student student){
        String studentName = student.getName();
        if (this.name.compareTo(studentName) < 0){
            return -1;
        }
        if (this.name.compareTo(studentName) > 0){
            return 1;
        }
        return 0;
    }

}
