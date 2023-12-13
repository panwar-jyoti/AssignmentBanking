import java.util.Date;
import java.util.List;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    String name;

    public Employee(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    List<Project> projects;
//    double salary;
//    Date doj;
//
//    public Date getDoj() {
//        return doj;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public Employee(String name, double salary, Date doj) {
//        this.name = name;
//        this.salary = salary;
//        this.doj = doj;
//    }

}
