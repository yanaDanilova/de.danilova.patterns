package behavioral.observer;

public class MainAppObs {
    public static void main(String[] args) {

        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsolObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(15, 750);
        meteoStation.setMeasurements(20, 765);

    }
}
