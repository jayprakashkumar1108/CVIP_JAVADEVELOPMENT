import java.util.Scanner;

public class BMIcalculator {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            double height,weight,bmi;
            System.out.print("Enter the weight in kg : ");
            weight=sc.nextDouble();
            System.out.print("Enter the Height in meter : ");
            height=sc.nextDouble();
            bmi=weight/(height+height);
            if(bmi<18.5){
                System.out.println("You are under weighted!");
            }else if(bmi>=18.5 && bmi<24.9){
                System.out.println("You are normal.");
            }else if(bmi>25 && bmi<29.9){
                System.out.println("You are overweighted!.");
            } else if(bmi>=30){
                System.out.println("you are obese!");
            }
    }
}
