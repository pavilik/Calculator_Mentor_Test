package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;
import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        String regexArab = "([1-9]0?)\\s([-+*\\/])\\s([1-9]0?)";
        String regexRoman = "(I+)?(V?)(I+)?(X?)\\s([-+*\\/])\\s(I+)?(V?)(I+)?(X?)";
        try {

            String str = new Scanner(System.in).next();

            if (str.matches(regexArab)) {
                //todo вычислить арабские
            } else if (str.matches(regexRoman)) {
                //todo вычислить римские

            } else {
                //todo показать исчключение завершить
                exit(1);
            }

//        for (int i=1; i<12;i++) {
//            String s= new RomanNumeral(i).toString();
//            str = s + ' ' +  "+" +' ' + s ;
//            // System.out.println(str);
//            System.out.println(str + "\t" + str.matches(regexRoman));
//            //System.out.println(new RomanNumeral(i));


            //___________________________________

//        String regex = "([1-9]0?)\\s([-+*\\/])\\s([1-9]0?)";
//
//                //"(?:\\d\\s+)?)\\s?+1" ;
//                //"([-+*\\\\/])\\s?(-?\\d+(?:\\d+)?)";
//
//            Pattern pattern=Pattern.compile(regex);
//
//        String str ;//= new Scanner(System.in).next();
//        for (int i=1; i<12;i++) {
//
//            str = valueOf(i) +' '+'-'+' '+ valueOf(i);
//           // System.out.println(str);
//            System.out.println(str + "\t" + str.matches(regex));
//        }

            //  StringBuffer sb = new StringBuffer(str);
            //       System.out.println(sb);
            //     System.out.println(str.matches(regex));
//*********************


            new Calculator().calcwithoperand(0, '+', 0);


            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
            exit(1);
        }
    }
}
