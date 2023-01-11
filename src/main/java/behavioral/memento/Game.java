package behavioral.memento;

public class Game {
     private int level;
     private int time;

    public void setLevel(int level) {
        this.level = level;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Saved save(){
        return new Saved(level,time);

     }

     public void load(Saved saved){
         this.level = saved.getLevel();
         this.time = saved.getTime();
     }

    public int getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return  level+ "/" + time;
    }
}
