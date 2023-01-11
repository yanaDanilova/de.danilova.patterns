package behavioral.observer;


import java.io.*;

public class FileObserver implements Observer{

    @Override
    public void handleMessage(int temp, int pres) {

        try {
            String updateMessage = "Wetter is updated: temp " + temp + " pres "+ pres + "\n";
            new FileWriter("wetter", true).append(updateMessage).flush();






        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
