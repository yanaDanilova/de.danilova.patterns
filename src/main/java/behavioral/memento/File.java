package behavioral.memento;

public class File {

    Saved saved;

    public Saved getSaved(){
        return saved;
    }

    public void setSaved(Saved saved){
        this.saved = saved;
    }

}
