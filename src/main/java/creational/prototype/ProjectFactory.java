package creational.prototype;

public class ProjectFactory  {
    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public Project copyProject(){
        return (Project) project.copy();
    }
}
