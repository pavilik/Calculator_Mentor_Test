package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;
import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        String regexArab = "([1-9]0?)\\s([-+*\\/])\\s([1-9]0?)";
        String regexRoman = "(I+)?(V?)(I+)?(X?)\\s([-+*\\/])\\s(I+)?(V?)(I+)?(X?)";
        String str;//строка для чтения введенных данных
        int a = 0; // первое число 1-10
        char o = '+'; //операнд вычисления
        int b = 0; //второе число 1-10
        boolean arabik = true; //признак арабских вычислений
        try {

            str = new Scanner(System.in).nextLine();//чтение строки из консоли

            String[] substr = str.split(" ");

            if (substr.length == 3) {
                if (str.matches(regexArab)) {
                    // вычислить арабские
                    a = Integer.parseInt(substr[0]);
                    o = substr[1].charAt(0);
                    b = Integer.parseInt(substr[2]);
                } else {
                    if (str.matches(regexRoman)) {
                        // вычислить римские
                        arabik = false;
                        a = new RomanNumeral(substr[0]).toInt();
                        o = substr[1].charAt(0);
                        b = new RomanNumeral(substr[2]).toInt();
                    } else {
                        // показать исчключение завершить
                        System.err.println("не допустимый формат данных");
                        exit(1);
                    }
                }
            } else {
                System.err.println("Неудалось разделить строку корректно");
                exit(1);
            }

//показать результат вычислений
            System.out.println(arabik ? new Calculator().calcwithoperand(a, o, b) : new RomanNumeral(new Calculator().calcwithoperand(a, o, b)));

        } catch (Exception e) {
            System.err.println(e.toString());
            exit(1);
        }
    }
}
