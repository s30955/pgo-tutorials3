import java.util.ArrayList;

public class Tester extends Employee {
    public ArrayList<String> TestType;

    public Tester(String firstName, String lastName, String adress, String emailAdress, int PESEL, int employmentYear){
        this.TestType = new ArrayList<>();
    }

    public void addtestType(String testType){
        testType.add(testType);
    }

    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = TestType.size()*300;
        return baseSalary + bonus;
    }
}
