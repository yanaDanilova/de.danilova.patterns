package behavioral.memento;

public class Saved {
   private final int level;
   private final int time;

    public Saved(int level, int time) {
        this.level = level;
        this.time = time;
    }


    public int getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }


}
