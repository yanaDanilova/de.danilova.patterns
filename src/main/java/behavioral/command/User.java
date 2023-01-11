package behavioral.command;

public class User {

    Command start;
    Command reset;
    Command stop;

    public User(Command start, Command reset, Command stop) {
        this.start = start;
        this.reset = reset;
        this.stop = stop;
    }


}
