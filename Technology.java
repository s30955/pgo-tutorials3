import java.util.ArrayList;

public class Technology {
    private String technology;
    private int bonus;

    public Technology(String technology, int bonus) {
        this.technology = technology;
        this.bonus = bonus;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus(){
        return bonus;
    }

}
