package homework_23.Task1;

public class TriangeleSingle {
    private double a;
    private double b;
    private double c;

    private static TriangeleSingle instance;

    private TriangeleSingle() {

    }

    public static TriangeleSingle getInstance(){
        if (instance == null){
            instance = new TriangeleSingle();
        }

        return instance;
    }
}
