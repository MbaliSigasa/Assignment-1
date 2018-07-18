package com.acn;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner user_name = new Scanner(System.in);

        System.out.println("Please Enter Name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);

        if (hour < 12)
            System.out.println("Good Morning " + username);
        else if (hour < 17 && !(hour == 12))
            System.out.println("Good Afternoon " + username);
        else if (hour == 12)
            System.out.println("Good Afternoon " + username);
        else
            System.out.println("Good Evening " + username);


        System.out.println("Please Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());


        Random rn = new Random();
        int ComputerAge = rn.nextInt(90 - 18) + 18;
        int difference;


        System.out.print("I am " + ComputerAge);
        System.out.print(" which is ");
        if (ComputerAge > age) {
            difference = ComputerAge - age;
            System.out.println(difference + " years older  ");
        } else {
            difference = age - ComputerAge;
            System.out.println(difference + " years younger");

            }
        System.out.println("Twice my age would be " + ComputerAge * 2);

        if (ComputerAge % 2 == 0)
            System.out.println("My age is an even number");
        else {
            System.out.println("My age is an odd number");}
        }
    }