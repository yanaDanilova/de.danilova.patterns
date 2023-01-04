package structural.proxy;

public class ProxyProject implements Project{

    private String url;

    public ProxyProject(String url) {
        this.url = url;
    }

   public void load(){
       System.out.println("load project from "+ url);
   }

    @Override
    public void run() {
        load();
        System.out.println("run project..");
    }
}
