package structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new JavaAppToDataBaseAdapter();

        dataBase.create();
        dataBase.update();
        dataBase.insert();
        dataBase.delete();
    }
}
