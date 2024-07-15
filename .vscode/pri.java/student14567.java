import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dob) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dob = LocalDate.parse(dob, formatter);
    }

    public void displayName() {
        System.out.println("Student Name: " + this.name);
    }

    public void displayAge() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(this.dob, today);
        System.out.println("Age: " + age.getYears());
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "2000-01-01");
        student.displayName();
        student.displayAge();
    }
}
