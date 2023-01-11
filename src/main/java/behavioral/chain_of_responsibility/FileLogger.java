package behavioral.chain_of_responsibility;

public class FileLogger extends Logger{
    FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("write into the File " + priority);
    }
}
