package com.bluesquare.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Result answer;

        Scanner input = Main.getScannerObject();
        System.out.println("Continue?(Y/N): ");
        String run = input.nextLine();

        while(run.equals("Y") || run.equals("y")){
            Scanner input1 = Main.getScannerObject();
            System.out.println("Enter Value 1: ");
            int value1 = input1.nextInt();

            Scanner input2 = Main.getScannerObject();
            System.out.println("Enter Value 2: ");
            int value2 = input2.nextInt();

            Scanner input3 = Main.getScannerObject();
            System.out.println("Select Operation; 1. Add, 2. Subtract, 3. Multiply, 4. Divide: ");
            int operator = input3.nextInt();

            if(operator == 1)
                answer = calculator.add(value1, value2);
            else if(operator == 2)
                answer = calculator.subtract(value1, value2);
            else if(operator == 3)
                answer = calculator.multiply(value1, value2);
            else
                answer = calculator.divide(value1, value2);

            if(answer.getAnswer() == -1 && operator == 4)
                System.out.println(answer.getErrorMessage());
            else
                System.out.println(answer.getAnswer());
        }

    }

    private static Scanner getScannerObject(){
        return new Scanner(System.in);
    }

}
