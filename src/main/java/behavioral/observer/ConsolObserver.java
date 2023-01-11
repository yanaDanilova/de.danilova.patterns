package behavioral.observer;

public class ConsolObserver implements Observer{
    @Override
    public void handleMessage(int temp, int pres) {
        System.out.println(" Wetter is updated : temp "+ temp+ " pressure "+ pres );
    }
}
