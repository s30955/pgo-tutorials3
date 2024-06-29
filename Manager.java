import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
    public int baseSalary;
    public ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String address, String emailAddress, String PESEL, int employmentYear) {
        super(firstName, lastName, address, emailAddress, PESEL, employmentYear);
    }

    public void addGoals(Goal goal){
         goals.add(goal);
     }

     public void getBonus(){

     }
    private boolean isGoalAchievedInCurrentMonth(Goal goal) {
        Calendar current = Calendar.getInstance();
        Calendar goalDate = Calendar.getInstance();
        goalDate.setTime(goal.getDate());

        return (current.get(Calendar.YEAR) == goalDate.get(Calendar.YEAR)) && (current.get(Calendar.MONTH) == goalDate.get(Calendar.MONTH));
    }

    public double calculateTotalBonus() {
        double totalBonus = 0;
        for (Goal goal : goals) {
            if (isGoalAchievedInCurrentMonth(goal)) {
                totalBonus += goal.getBonusAmount();
            }
        }
        return totalBonus;
    }
}
