package M9_Github_assignm.M6_OOP;

public class Accountant extends Employees {
    String title = "Accountant";
    int salary = 5000;

    public Accountant (String name, int id, String dateOfBirth, String address){
        setName(name);
        setId(id);
        setTitle(title);
        setDateOfBirth(dateOfBirth);
        setSalary(salary);
        setAddress(address);
    }
    public void accountOpening() {
        System.out.println(String.format("The %s opens new accounts.", title));
    }
    public void accountClosing() {
        System.out.println(String.format("The %s closes accounts.", title));
    }
    public void reportMaking() {
        System.out.println(String.format("The %s creates reports.", title));
    }

}
