import java.util.Objects;

public class Project {
    String name;
    double cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project project)) return false;
        return Double.compare(cost, project.cost) == 0 && Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Project(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

}
