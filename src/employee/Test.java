package employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> l = Arrays.asList(
                new Employee("emp1", "test engineer"),
                new Employee("emp2", "test engineer"),
                new Employee("emp2", "manager")
        );

        Map<String, Long> emp = l.stream().collect(Collectors.groupingBy(Employee::getDes, Collectors.counting()));
        System.out.println(emp);
    }
}
