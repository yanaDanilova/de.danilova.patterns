package behavioral.chain_of_responsibility;

public abstract class Logger {
    int priority;

    Logger(int priority){
        this.priority = priority;
    }

    Logger next;

    public void setNext(Logger next){
        this.next = next;
    }

    public void writeMessage(String message, int level){
        if(priority >= level){
            write(message);
        }
        if(next!= null){
            next.writeMessage(message,level);
        }

    }
    public abstract void write(String message);
}
