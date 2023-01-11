package behavioral.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Client client = new Client();

        client.setStrategy(new BubbleSort());
        int[] arr = {5,7,2,9};
        client.executeStrategy(arr);

        client.setStrategy(new SelectionSort());
        int[] arr1 = {4,9,2,6};
        client.executeStrategy(arr1);




    }
}
