package creational.builder;

public class Item {


    private String title;
    private Category category;
    private int price;

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    private Item(ItemBuilder itemBuilder){
        this.title = itemBuilder.title;
        this.category = itemBuilder.category;
        this.price = itemBuilder.price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    static class ItemBuilder{
        private String title;
        private Category category;
        private int price;

        public ItemBuilder buildCategory(Category category){
            this.category= category;
            return this;
        }
        public ItemBuilder buildPrice(int price){
            this.price= price;
            return this;
        }

        public ItemBuilder buildTitle(String title){
            this.title = title;
            return this;
        }

        public Item build(){
            return new Item(this);
        }
    }
}
