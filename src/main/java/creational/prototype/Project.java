package creational.prototype;

public class Project implements Copyble{

    private int id;


    public Project(int id) {
        this.id=id;
    }


    @Override
    public Object copy() {
        Project projectCopy = new Project(id);
        return projectCopy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                '}';
    }
}
