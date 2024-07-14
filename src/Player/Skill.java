package Player;

import java.util.ArrayList;
import java.util.List;

public class Skill {
    private List<String> skills = new ArrayList<>();
    public Skill() {
        skills.add("Fire_Ball");
        skills.add("Double_Hit");
        skills.add("Healing");
    }
    public List<String> getSkill() {
        return skills;
    }
}
