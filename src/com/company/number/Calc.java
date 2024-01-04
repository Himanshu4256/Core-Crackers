package com.company.number;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter operator to perform operation(+,-,*,/)");

        char operator = sc.next().charAt(0);
        double o = 0;
        switch (operator){
            case '+':
                o = num1+num2;
                break;

                case '*':
                o = num1*num2;
                break;

            case '/':
                o = num1/num2;
                break;

            case '-':
                o = num1-num2;
                break;

            default:
                System.out.println("wrong operator");
                break;
        }

        System.out.println(num1 + " " + operator +" "+num2+" = "+o);

    }
}
