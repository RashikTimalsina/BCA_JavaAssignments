package com.rashiktimalsina.java_assignment.factorial;

class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1) {  // Base case
            return 1;
        }
        return n * factorial(n - 1);  // Recursive call
    }
}
