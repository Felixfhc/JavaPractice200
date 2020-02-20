package com.Felixfhc.JavaPractice200.BaseApplication;

import java.util.Scanner;

/**
 * author:Felixfhc
 * date: 2020/2/20 14:14:27
 * description:1.input a number(year)
 * 2.judge whether it is leapyear
 **/
public class LeapYear
    {
        public static void main(String[] args)
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("please input a year-number");
                long year = scan.nextLong();
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    {
                        System.out.println(year + " is a leapyear ");
                    } else
                    {
                        System.out.println(year + " is not a leapyear");
                    }

            }


    }
