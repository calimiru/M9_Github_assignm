package M9_Github_assignm.M6_OOP;

public class Clerk extends Employees {
    String title = "Clerk";
    int salary = 3000;

    public Clerk (String name, int id, String dateOfBirth, String address){
        setName(name);
        setId(id);
        setTitle(title);
        setDateOfBirth(dateOfBirth);
        setSalary(salary);
        setAddress(address);
    }
    public void callingCustomers(){
        System.out.println(String.format("The %s calls customers.", title));
    }
    public void answeringCalls(){
        System.out.println(String.format("The %s answers incoming calls from customers.", title));
    }

}
