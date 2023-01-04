package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> team = new ArrayList<>();

    public void add(Developer developer){
       team.add(developer);
    }
    public void remove(Developer developer){
        team.remove(developer);
    }
    public void createProject(){
        for (Developer developer: team){
            developer.writeCode();
        }
    }
}
