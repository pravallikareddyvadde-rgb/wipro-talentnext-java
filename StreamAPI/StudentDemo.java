package StreamAPI;

import java.util.ArrayList;

public class StudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Nithin", 85));
        list.add(new Student(2, "Rahul", 45));
        list.add(new Student(3, "Sneha", 70));
        list.add(new Student(4, "Kiran", 55));
        list.add(new Student(5, "Anjali", 30));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed: " + count);
    }
}
