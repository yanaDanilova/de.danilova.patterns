package behavioral.strategy;

public class Client {
    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr){
        strategy.sort(arr);
    }


}
