package structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com/yanadanilova/realProject");
        project.run();
    }



}
