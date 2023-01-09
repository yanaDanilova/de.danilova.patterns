package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {

    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloperOnSpecialty("java"));
        developers.add(factory.getDeveloperOnSpecialty("java"));
        developers.add(factory.getDeveloperOnSpecialty("cpp"));

        for(Developer developer: developers){
           developer.writeCode();
        }

    }


}
