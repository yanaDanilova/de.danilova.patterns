package structural.adapter;

public class JavaAppToDataBaseAdapter extends JavaApp implements DataBase{
    @Override
    public void create() {
        createObject();
    }

    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
       removeObject();
    }
}
