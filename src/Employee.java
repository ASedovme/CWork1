import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String fatherName;
    private int numberDepartment;
    public static int countId = 0;
    private int id;
    private double wages;


    public Employee(String surname, String name, String fatherName, int numberDepartment, double wages) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.numberDepartment = numberDepartment;
        this.wages = wages;
        this.id = ++ countId;


    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(fatherName, employee.fatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, fatherName);
    }

    public String toString() {
        return "ID " + this.id + " " + this.surname + " " + this.name + " " + this.fatherName + ", номер департамента " + this.numberDepartment + ", заработная плата " + this.wages;
    }


}

