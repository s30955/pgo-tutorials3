import java.util.ArrayList;

public class Developer extends Employee{
    private ArrayList<Technology> technologies;

    public Developer(String firstName, String lastName, String adress, String emailAdress, int PESEL, int employmentYear){
        this.technologies = new ArrayList<>;

    }

    public void addTechnology(Technology technology){
        technologies.add(technology);
    }



    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology tech : technologies){
            bonus+=tech.getBonus();
        }
        return baseSalary + bonus;
    }
}
