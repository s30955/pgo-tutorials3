import java.util.ArrayList;

public class Manager extends Employee {
    public ArrayList<Goal> goals;
     public Manager(String firstName, String lastName, String adress, String emailAdress, int PESEL, int employmentYear {
         super(firstName,lastName, adress, emailAdress, PESEL, employmentYear);
         this.goals = new ArrayList<>();
     }

     public void addGoals(Goal goal){
         goals.add(goal);
     }

     public int calculateSalary(){
         int baseSalary = super.calculateSalary();
         int bonus = 0;
         for (Goal goal : goals){
             if goals.isAchievedInCurrentMonth(){
                 bonus += goal.getBonus;
             }
         }
         return baseSalary + bonus;
     }
}
