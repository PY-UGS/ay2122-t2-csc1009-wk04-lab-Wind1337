import java.util.Scanner;

public class BMICalculator {

    public static void main (String [] args){
        double weight;
        double height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        BMI bmi1 = new BMI(weight, height);
        double result = bmi1.calculateBMI();

        System.out.println("BMI is " + result);

        if (result < 18.5){
            System.out.println("Underweight");
        }
        else if (result < 25){
            System.out.println("Normal");
        }
        else if (result < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
