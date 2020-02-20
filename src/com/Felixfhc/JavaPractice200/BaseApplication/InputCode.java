package com.Felixfhc.JavaPractice200.BaseApplication;

import java.util.Scanner;

/**
 * author:Felixfhc
 * date: 2020/2/20 14:37:06
 * description:1.input a number of identity
 * 2.output how much the digit of identity
 **/
public class InputCode
    {
        public static void main(String[] args)
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("please input a number of identity");
                String bitNumber = scan.nextLine();
                System.out.println("This the digit of identity is " + bitNumber.length());

            }

    }
