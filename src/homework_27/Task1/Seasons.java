package homework_27.Task1;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.

 */

public enum Seasons {

    WINTER(-10),
    SPRING(15),
    SUMMER(20),
    AUTUMN(10);

    private final int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println(season.name() + ": Средняя температура = " + season.getAverageTemp());
        }
    }
}

