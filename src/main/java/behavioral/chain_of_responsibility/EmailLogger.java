package behavioral.chain_of_responsibility;

public class EmailLogger extends Logger{
    EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("write Email " + priority);
    }
}
