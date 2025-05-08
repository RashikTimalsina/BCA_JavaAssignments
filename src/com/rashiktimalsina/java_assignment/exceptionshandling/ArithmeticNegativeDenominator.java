package com.rashiktimalsina.java_assignment.exceptionshandling;

/**
 * @author Rashik Timalsina
 * @created 14/03/2025
 */

class NegativeDenominatorException extends RuntimeException {
    public NegativeDenominatorException(String message) {
        super(message);             // Constructor of the parent class
    }
}

public class ArithmeticNegativeDenominator {

    static double divide(int num, int den) throws NegativeDenominatorException {
        if (den < 0) {
            throw new NegativeDenominatorException("Error : Denominator cannot be negative!");
        }
        if (den == 0) {
            throw new ArithmeticException("Denominator cannot be zero!");
        }

        return (double) num/ den;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = -2;

        try {
            double result = divide(numerator, denominator);
            System.out.println( result);

        }
        catch (ArithmeticException ae) {
            System.out.println(" A number cannot be divided by zero!");
        } catch (NegativeDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }

}