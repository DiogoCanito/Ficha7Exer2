package org.example;

public class Metodos {

    public boolean isPrime(int number){

        // Corner case
        if (number <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public boolean isEven(int number){

        return Math.abs(number) % 2 == 0;
    }

    public boolean isMultiple(int number, int divisor) {

        return number % divisor == 0;
    }
}
