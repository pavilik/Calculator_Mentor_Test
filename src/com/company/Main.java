package com.company;

import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        String regexArab = "([1-9]0?)\\s([-+*\\/])\\s([1-9]0?)";
        String regexRoman = "(I+)?(V?)(I+)?(X?)\\s([-+*\\/])\\s(I+)?(V?)(I+)?(X?)";
        String str;//строка для чтения введенных данных
        int a; // первое число 1-10
        char o ; //операнд вычисления
        int b ; //второе число 1-10
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
                        //  исчключение
                        throw new Exception("не допустимый формат данных");
                    }
                }
            } else {

                throw new Exception("не удалось корректно разделить строку");
            }
//показать результат вычислений
            System.out.println(arabik ? new Calculator().calcwithoperand(a, o, b) : new RomanNumeral(new Calculator().calcwithoperand(a, o, b)));
        } catch (Exception e) {
            System.err.println(e.toString());
            exit(1);
        }
    }
}
