package M9_Github_assignm.M6_OOP;

import java.util.ArrayList;

public class M6_OOP_main {
    public static void main(String[] args) {

        Manager manager = new Manager("Nick Johnas", 1, "20.11.2000", "New-York");
        Clerk clerk1 = new Clerk("John Dow", 2, "20.12.1978", "Michigan city");
        Clerk clerk2 = new Clerk("Bernard Krasinski", 3, "25.04.1985", "Chicago");
        Clerk clerk3 = new Clerk("Nicholas Cage", 4, "14.05.2002", "Moscow");
        Accountant accountant1 = new Accountant("Adam Sandler", 5, "12.08.2001", "New Hampshire");
        Accountant accountant2 = new Accountant("Maria Sharapova", 6, "15.06.2000", "London");
        Accountant accountant3 = new Accountant("Jet Li", 7, "13.01.2005", "Kitchener");
        Accountant accountant4 = new Accountant("Tom Cruise", 8, "03.04.2019", "Kitchener");
        Accountant accountant5 = new Accountant("Val Kilmer", 9, "05.05.2001", "Toronto");

        manager.hiringEmployees();
        clerk3.answeringCalls();
        accountant5.reportMaking();
        accountant3.receiveSalary();

        ArrayList<Employees> employeesList = new ArrayList<>();
        employeesList.add(manager);
        employeesList.add(clerk1);
        employeesList.add(clerk2);
        employeesList.add(clerk3);
        employeesList.add(accountant1);
        employeesList.add(accountant2);
        employeesList.add(accountant3);
        employeesList.add(accountant4);
        employeesList.add(accountant5);

        for (Employees allEmployees : employeesList) {
            System.out.println(allEmployees.toString());
        }

    }

}
