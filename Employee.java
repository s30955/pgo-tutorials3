import java.util.ArrayList;

public class Employee {

    private String firstName;
    private String lastName;
    private String address;
    private String emailAddress;
    private String PESEL;
    private int employmentYear;

    public Employee(String firstName, String lastName, String adress, String emailAdress, String PESEL, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = adress;
        this.emailAddress = emailAdress;
        this.PESEL = PESEL;
        this.employmentYear = employmentYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getEmailAdress() {
        return emailAddress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAddress = emailAdress;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }

    public int calculateSalary(){
        int currentYear=2024;
        int baseSalary=3000+1000*(currentYear-employmentYear);

        return baseSalary;

    }
}

