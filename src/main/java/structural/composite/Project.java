package structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDeveloper1 = new JavaDeveloper();
        Developer javaDeveloper2 = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.add(javaDeveloper1);
        team.add(javaDeveloper2);
        team.add(cppDeveloper);

        team.createProject();
    }
}
