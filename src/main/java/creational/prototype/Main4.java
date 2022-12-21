package creational.prototype;

public class Main4 {
    public static void main(String[] args)  {

        Project project = new Project(1);

        ProjectFactory projectFactory = new ProjectFactory(project);
        System.out.println(project);

        Project projectCopy = projectFactory.copyProject();
        System.out.println(projectCopy);
    }
}
