package com.LogicalOperatorValidator;
import java.util.Scanner;

public class LogicalOperator{
    public static boolean isValidInput(boolean isInputValid, boolean meetsCertainCondition) {
        return isInputValid && meetsCertainCondition;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);        
    	boolean isInputValid =sc.nextBoolean(); // Replace with actual validation logic
        boolean meetsCertainCondition = sc.nextBoolean() ;// Replace with actual condition check

        boolean result = isValidInput(isInputValid, meetsCertainCondition);

        System.out.println("Is input valid (true/false): " + isInputValid);
        System.out.println("Does input meet a certain condition (true/false): " + meetsCertainCondition);

        if (result) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is not valid.");
        }
        sc.close();
    }
}