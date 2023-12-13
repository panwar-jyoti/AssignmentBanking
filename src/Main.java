import assignment.Assessment;
import assignment.Student;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        List<Employee> l = Arrays.asList(
//                new Employee("a", 32, new Date(2020, 13, 21)),
//                new Employee("b", 32, new Date(2005, 11, 20)),
//                new Employee("c", 32, new Date(2000, 11, 1))
//        );
//
//        //latest joinee
//        System.out.println(l.stream().sorted(Comparator.comparing(Employee::getDoj).reversed()).findFirst().get().getName());

        List<Employee> e = Arrays.asList(
                new Employee("a",
                        Arrays.asList(
                                new Project("x", 325),
                                new Project("y", 32435),
                                new Project("z", 3425)
                        )
                ),
                new Employee("b",
                        Arrays.asList(
                                new Project("b", 325),
                                new Project("y", 32435)
                        )
                )
        );

        e.stream().collect(Collectors.toMap(
                Employee::getName, emp -> emp.getProjects().stream().map(Project::getCost).reduce(0.0, Double::sum)
                )
        ).forEach(
                (name, cost)->System.out.println(name+" "+cost)
        );

        e.stream().map(Employee::getProjects).flatMap(List::stream).toList().stream().distinct().forEach(System.out::println);

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(l.stream().filter(n -> (n & 1) == 1).reduce(0, (a, n) -> a + n * 2));

        //student name list assessment
        //assessment name , grades
        //best average

        List<Student> stds = Arrays.asList(
                new Student("a", Arrays.asList(new Assessment("x", 50), new Assessment("y", 60))),
                new Student("a", Arrays.asList(new Assessment("x", 50), new Assessment("y", 60)))
                );

        stds.stream().collect(Collectors.toMap(Student::getName, std->std.getAssessments().stream().map(Assessment::getGrade).reduce(0.0, Double::sum)));
    }
}