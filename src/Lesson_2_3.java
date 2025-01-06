public class Lesson_2_3 {

    public static void makeTea() {
        // Невозвращаемый метод без параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }

    public static void main(String[] args) { // DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        addition("Сумма чисел", 2, 7);
        addition("Результат сложения", 20, 3);

        calculatePerimeter(6.5f, 4.5f, "Аудитория 4");
        calculatePerimeter(4, 3.5f, "Кухня");
        calculatePerimeter(10.5f, 7, "Холл");
        int areaOfAuditory4 = calculateArea(6.5f, 4.5f);
        int areaOfKitchen = calculateArea(4, 3.5f);
        int areaOfHall = calculateArea(10.5f, 7);
        System.out.println("Площадь Аудитории 4: " + areaOfAuditory4 + " квадратных " + getUnit());
        System.out.println("Площадь Кухни: " + areaOfKitchen + " квадратных " + getUnit());
        System.out.println("Площадь Холла: " + areaOfHall + " квадратных " + getUnit());
        System.out.println("Площадь ОБЩАЯ: " + (areaOfAuditory4 + areaOfKitchen + areaOfHall)
                + " квадратных " + getUnit());
    }

    public static String getUnit() {
        return "м.";
    }

    public static int calculateArea(float length, float width) {
        // Возвращаемый метод с параметрами
        int area = Math.round(length * width);
        return area;
    }

    public static void calculatePerimeter(float length, float width, String roomName) {
        // Невозвращаемый метод с параметрами
        float perimeter = (length + width) * 2;
        System.out.println("Периметр комнаты " + roomName + ": " + perimeter + " " + getUnit());
    }

    public static void addition(String phrase, int num1, int num2) {
        // Невозвращаемый метод с параметрами
        int result = num1 + num2;
        System.out.println(phrase + ": " + result);
    }

    public static void duration() {
        // Невозвращаемый метод без параметров
        System.out.println("Длительность: 5 мин");
    }
}
