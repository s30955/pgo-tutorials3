import java.util.ArrayList;

public class Technology {
    private String technology;
    private int bonus;

    public void newTechnology(String technology, int bonus) {
        this.bonus = bonus;
        this.technology = technology;

    }

    public int getBonus(){
        return bonus;
    }

}
