package creational.builder;

public class Main3 {
    public static void main(String[] args) {

        Item item = new Item.ItemBuilder()
                .buildTitle("T-Shirt")
                .buildCategory(Category.Clothes)
                .buildPrice(50)
                .build();

        System.out.println(item);
    }

}
