package com.bridgelabz;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1581;
        boolean leapYear = false;
        if(year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    }
                    else {
                        leapYear = false;
                    }
                }
                else {
                    leapYear = true;
                }
            }
            else {
                leapYear = false;
            }
        }
        else {
            System.out.println("The given year should be more than 1582.");
        }
        if (leapYear) {
            System.out.println("The Year "+year+" is a Leap Year.");
        }
        else {
            System.out.println("The year "+year+" is not a Leap Year.");
        }
    }
}
