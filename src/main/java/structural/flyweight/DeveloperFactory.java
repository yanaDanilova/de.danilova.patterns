package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private Map<String ,Developer> developers = new HashMap<>();

    public Developer getDeveloperOnSpecialty(String specialty){

        Developer developer = developers.get(specialty);

        if(developer == null){
            switch (specialty){
                case "java":
                    System.out.println("Hiring Java Developer");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring Cpp Developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty,developer);

        }
        return developer;
    }
}
