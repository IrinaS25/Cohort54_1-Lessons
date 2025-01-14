package storeOfMusicalInstruments.main.model;

public class Instrument {
    public static int counter = 1;
    private int id;
    private String name;
    CategoryMusicInstruments category;
    private double price;

    public Instrument(String name, CategoryMusicInstruments category, double price) {
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

    public CategoryMusicInstruments getCategory() {
        return category;
    }

    public void setCategory(CategoryMusicInstruments category) {
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
        return "Instrument: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
