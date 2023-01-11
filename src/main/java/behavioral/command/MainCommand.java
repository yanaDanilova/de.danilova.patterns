package behavioral.command;

public class MainCommand {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer),new ResetCommand(computer),new StopCommand(computer));
        user.start.execute();
        user.reset.execute();
        user.stop.execute();
    }
}
