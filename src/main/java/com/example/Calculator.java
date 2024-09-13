package com.example;

public class Calculator {
    
    public Double Add(Double a,Double b)
    {
        return a + b;
    }
    public Double Substraction(Double a,Double b)
    {
        return a - b;
    }
    public Double multiplication(Double a,Double b)
    {
        return a * b;
    }
    public Double Division(Double a,Double b)
    {
        return a / b;
    }
    public Double Square(Double a)
    {
        return a*a;
    }
    public Double Power(Double a,Double b)
    {
        Double ans = 1.0;
        while(b != 0)
        {
            ans *= a;
            --b;
        }

     
        return ans;
    }
}
