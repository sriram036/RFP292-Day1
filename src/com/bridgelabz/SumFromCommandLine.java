package com.bridgelabz;

public class SumFromCommandLine {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for(int i=0;i<args.length;i++){
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (Exception e) {
                count++;
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Invalid Integer Count : "+ count);
    }
}
