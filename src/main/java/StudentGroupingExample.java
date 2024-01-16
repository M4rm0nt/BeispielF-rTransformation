import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StudentGroupingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 20));
        students.add(new Student("David", 23));

        // Gruppieren Sie Studenten nach ihren Altersgruppen in einer Map
        Map<Integer, List<Student>> ageGroupMap = new HashMap<>();
        for (Student student : students) {
            int age = student.getAge();
            if (!ageGroupMap.containsKey(age)) {
                ageGroupMap.put(age, new ArrayList<>());
            }
            ageGroupMap.get(age).add(student);
        }

        // Jetzt haben Sie eine Map, die Studenten nach ihren Altersgruppen gruppiert
        // Sie können auf die Gruppen zugreifen und mit den darin enthaltenen Studenten arbeiten
        for (Map.Entry<Integer, List<Student>> entry : ageGroupMap.entrySet()) {
            int age = entry.getKey();
            List<Student> studentsInAgeGroup = entry.getValue();
            System.out.println("Alter: " + age);
            for (Student student : studentsInAgeGroup) {
                System.out.println("Name: " + student.getName());
            }
            System.out.println();
        }
    }
}
