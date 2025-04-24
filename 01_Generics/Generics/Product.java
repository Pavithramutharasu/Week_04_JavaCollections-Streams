interface Category {
    String getCategoryName();
}
enum BookCategory implements Category {
    FICTION, NONFICTION, EDUCATIONAL;

    public String getCategoryName() {
        return this.name();
    }
}
enum ClothingCategory implements Category {
    FASHION, SPORTS, ACCESSORIES;
    public String getCategoryName() {
        return this.name();
    }
}
enum GadgetCategory implements Category {
    SMARTPHONES, LAPTOPS, TABLETS;
    public String getCategoryName() {
        return this.name();
    }
}

public class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public T getCategory() {
        return this.category;
    }
    public static <T extends Category> void applyDiscount(Product<T> product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        System.out.println("Discount applied to " + product.getName() + " (" + product.getCategory
                ().getCategoryName() + "): " + discount);
    }
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Harry Potter", 19.99, BookCategory
                .FICTION);
        Product<ClothingCategory> clothing = new Product<>("Nike T-Shirt", 29.99
                , ClothingCategory.FASHION);
        Product<GadgetCategory> gadget = new Product<>("Apple iPhone", 999.99
                , GadgetCategory.SMARTPHONES);
        applyDiscount(book, 10);
        applyDiscount(clothing, 20);
        applyDiscount(gadget, 15);

    }
}