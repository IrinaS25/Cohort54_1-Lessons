package homework_21;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Storage storage) {
        this.storage = storage;
        this.processor = new Processor("Intel", "inter Core i9-13900K");
        this.memory = new Memory("Samsung", "Samsung EVO Plus 256GB MicroSDXC");
    }

    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder("Computer: \n");
        sb1.append("processor: ").append(processor);
        sb1.append("memory: ").append(memory);
        sb1.append("storage: ").append(storage);

        return sb1.toString();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}


