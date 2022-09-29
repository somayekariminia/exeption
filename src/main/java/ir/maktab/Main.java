package ir.maktab;

import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a;
        double b;
      a=numberExtract();
      b=numberExtract();
       DivedTwoNumber divedTwoNumber=new DivedTwoNumber(a,b);
        try {
                System.out.println(divedTwoNumber.divide());

            } catch (InvalidInputExeption e) {
                System.err.println(e.getMessage());
            }
        }

    private static double numberExtract() {
        boolean answer = true;
        double a=0;
        while (answer) {
            System.out.println("enter number");
            String number1= scanner.nextLine();
            if(ValidationNumber.digitValidation(number1))
            {
                answer = false;
                a=Double.parseDouble(number1);
            }
            else answer=true;
        }
        return a;
    }
}


