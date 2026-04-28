package _03;

import java.util.Scanner;
public class Temperature03 {

    private double temperature;
    private char unit;

    public Temperature03() {
        temperature = 0;
        unit = 'C';
    }
    public Temperature03(double temperature) {
        this.temperature = temperature;
        unit = 'C';
    }
    public Temperature03(char unit) {
        this.unit = unit;
        temperature = 0;
    }

    public Temperature03(double temperature, char unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public void writeOutput() {
        System.out.println("Temperature = " + temperature + " degrees " + unit + ".");
    }
    public void readInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature(e.g. , 29.6):");
        temperature = s.nextDouble();
        System.out.print("Enter unit('C' for Celsius, 'F' for Fahrenheit') :");
        unit = s.next().charAt(0);
    }
    public void writeC(){
        double x;
        if(unit=='C'){
            x = temperature;
        }
        else{
            x = 5.0 /9.0 * (temperature - 32);
        }
        System.out.println("Temperature = " + x + "degrees C.");
    }
    public void writeF(){
        double y;
        if(unit=='F'){
            y = temperature;
        }
        else{
            y = 9.0 /5.0 *temperature + 32;
        }
        System.out.println("Temperature = " + y + "degrees F.");
    }
    public void set(double temperature) {
        this.temperature = temperature;
    }

    public void set(char unit) {
        this.unit = unit;
    }
    public void set(double temperature, char unit) {
        this.temperature = temperature;
        this.unit = unit;
    }



}

