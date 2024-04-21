import java.util.ArrayList;

public class Employee {

    private String firstName;
    private String lastName;
    private String adress;
    private String emailAdress;
    private int PESEL;
    private int employmentYear;

    public void newEmployee(String firstName, String lastName, String adress, String emailAdress, int PESEL. int employmentYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.emailAdress = emailAdress;
        this.PESEL = PESEL;
        this.employmentYear = employmentYear;
    }

    public int calculateSalary(){
        int currentYear=2024;
        int baseSalary=3000+1000*(currentYear-employmentYear);

        return baseSalary;

    }


    }



}
