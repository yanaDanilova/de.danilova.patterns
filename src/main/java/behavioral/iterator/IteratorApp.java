package behavioral.iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        Iterator iterator = tasks.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
