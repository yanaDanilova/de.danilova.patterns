package behavioral.iterator;



public class Tasks implements Container {

    String[] tasks = {"Jump", "Run", "Stop"};


    @Override
    public Iterator getIterator() {
        return new TasksIterator();
    }

    private class TasksIterator implements Iterator{

        int index=0;

        @Override
        public boolean hasNext() {
            if(index<tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}

