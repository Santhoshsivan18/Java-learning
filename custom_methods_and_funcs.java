
// import java.awt.*;

public class custom_methods_and_funcs {
    // public static void main(String[] args) {
    // System.out.println("Hello world");
    // car car1 = new car(25, "TN86D1722", Color.BLUE, true);
    // car car2 = new car(18, "TN33AQ2175", Color.BLACK, false);
    // System.out.println(car1.licensePlateNumber);
    // System.out.println(car2.licensePlateNumber);
    // System.out.println(car1.paintColor);
    // car1.changePaintColor(Color.RED);
    // System.out.println(car1.paintColor);
    // double myCarSpeed = 20;
    // System.out.println(car1.speedingUp(myCarSpeed));
    // }
    public static void main(String[] args) {
        dog d = new dog("Donglee", 4);
        d.bark();
        int dyear = d.ageofdog();
        // int dyear = d.ageofdog(2);
        System.out.println(dyear + " dog years");
        d.fetch();
        d.fetch();
        d.fetch();
        d.fetch();
    }
}