package homework_21;

/*Task 2
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами.
Компоненты Processor и Memory не могу существовать без компьютера.

 */

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("brand: ").append(brand);
        sb.append("; model: ").append(model);
        sb.append("\n");
        return sb.toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
