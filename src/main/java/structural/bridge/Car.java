package structural.bridge;

public abstract class Car {

    Brand brand;

    public Car(Brand brand){
        this.brand = brand;
    }
    public abstract void showDetails();

}

