package M9_Github_assignm.M6_OOP;

abstract class Employees {

    private String name;
    private int id;
    private String title;
    private String dateOfBirth;
    private int salary;
    private String address;

    public Employees() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary() {
        System.out.println(String.format("%s %s receives a salary of $%s.", title, name, salary));
    }

    public String toString() {
        return "Name: " + name + ", " + "id: " + id + ", " + "Title: " + title + ", " + "Date of birth: " + dateOfBirth + ", "
                + "Salary: $" + salary + ", " + "Address: " + address + '.';
    }


}
