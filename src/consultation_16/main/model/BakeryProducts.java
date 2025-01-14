package consultation_16.main.model;

public class BakeryProducts {
    public static int counter = 1;
    int id;
    String name;
    CategoryBakeryProducts category;
    double price;

    public BakeryProducts(String name, CategoryBakeryProducts category, double price) {
        this.id = counter++;
        this.name = name;
        this.category = category;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryBakeryProducts getCategory() {
        return category;
    }

    public void setCategory(CategoryBakeryProducts category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Goods: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
