package structural.bridge;

public class Sedan extends Car {

    public Sedan(Brand brand) {
        super(brand);
    }

    @Override
    public void showDetails() {
        System.out.println("sedan");
        brand.showBrand();
    }


}
