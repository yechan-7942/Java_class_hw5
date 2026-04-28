package _02;

import java.util.Scanner;

public class Temperature02 {

    private double temperature;
    private char unit;

    public Temperature02() {
        temperature = 0;
        unit = 'C';
    }

    public Temperature02(double temperature) {
        this.temperature = temperature;
        unit = 'C';
    }

    public void writeOutput() {
        System.out.println("Temperature = " + temperature + " degrees " + unit + ".");
    }
    public void readInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature(e.g. , 29.6):");
        temperature = s.nextDouble();
        System.out.print("Enter unit('C' ofr Celsius, 'F' ofr Fahrenheit') :");
        unit = s.next().charAt(0);
    }
    public void writeC(){
        double x;
        if(unit=='C'){
            x = temperature;
        }
        else{
            x = 5/9 * (temperature - 32);
        }
        System.out.println("Temperature = " + x + "degrees C.");
    }
    public void wirteF(){
        double y;
        if(unit=='F'){
            y = temperature;
        }
        else{
            y = 9/5*temperature + 32;
        }
        System.out.println("Temperature = " + y + "degrees F.");
    }


}

