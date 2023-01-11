package behavioral.chain_of_responsibility;

public class SMSLogger extends Logger{

    SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("write SMS "+ priority);
    }
}
