package com.practise.algorithms;

public class Factorial {
    public int recursiveFactorial(int num){
        if(num == 0){ // base case or breaking condition
            return 1;
        }
        return num * recursiveFactorial(num -1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 5;
        int factorialResult = factorial.recursiveFactorial(num);
        System.out.printf("Factorial of %d is : %d", num, factorialResult);
    }
}
