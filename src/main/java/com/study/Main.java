package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new CalculatorImpl();

        System.out.print("숫자 입력 : ");
        int num1 = scanner.nextInt();

        System.out.print("연산자 입력 : ");
        String oper = scanner.next();

        System.out.print("숫자 입력 : ");
        int num2 = scanner.nextInt();

        switch (oper) {
            case "+":
                calculator.add(num1, num2);
                break;
            case "-":
                calculator.sub(num1, num2);
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
        }
    }
}