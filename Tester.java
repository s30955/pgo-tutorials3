import java.util.ArrayList;

public class Tester extends Employee {
    public ArrayList<String> TestType;

    public Tester(String firstName, String lastName, String adress, String emailAdress, String PESEL, int employmentYear){
        super(firstName, lastName, adress, emailAdress, PESEL, employmentYear);
        this.TestType = new ArrayList<>();
    }

    public void addTestType(String testType){

        TestType.add(testType);
    }

    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = TestType.size()*300;
        return baseSalary + bonus;
    }
}
