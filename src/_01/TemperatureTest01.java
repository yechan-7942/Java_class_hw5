package _01;

public class TemperatureTest01 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Test case 1: default constructor and");
        System.out.println("writeOutput() method.");
        System.out.println();
        Temperature01 t1 = new Temperature01();
        System.out.println("Results of default constructor:");
        System.out.println("Verify 0 degrees C.");
        System.out.println();
        t1.writeOutput();
        System.out.println();
        System.out.println("==========================================");


        System.out.println("Test case 3: constructor with just temperature.");
        Temperature01 t2 = new Temperature01(20.5);
        System.out.println();
        System.out.println("Verify 20.5 degrees C.");
        System.out.println();
        t2.writeOutput();
        System.out.println();
        System.out.println("==========================================");

    }
}