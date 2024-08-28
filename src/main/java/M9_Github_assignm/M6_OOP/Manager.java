package M9_Github_assignm.M6_OOP;

public class Manager extends Employees {

    String title = "Manager";
    int salary = 10000;


    public Manager (String name, int id, String dateOfBirth, String address){
        setName(name);
        setId(id);
        setTitle(title);
        setDateOfBirth(dateOfBirth);
        setSalary(salary);
        setAddress(address);
    }
    public void hiringEmployees(){
        System.out.println(String.format("The %s hires employees.", title));
    }
    public void firingEmployees(){
        System.out.println(String.format("The %s fires employees.", title));
    }

}
