package structural.bridge;

public class Hatchback extends Car {

    public Hatchback(Brand brand) {
        super(brand);
    }

    @Override
    public void showDetails() {
        System.out.println("Hatchback");
        brand.showBrand();
    }


}
