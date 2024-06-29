import java.util.ArrayList;
import java.util.Date;

public class Goal {
 private String name;
 public int bonusAmount;
 public Date date;

 public Goal(Date date,String name, int bonusAmount){
     this.date = date;
     this.name = name;
     this.bonusAmount = bonusAmount;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
