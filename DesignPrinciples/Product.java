package DesignPrinciples;

public class Product implements Calculator
{
    @Override
    public void calculate(int x1, int x2) {
        int product=x1*x2;
        System.out.println("The product of two number is "+product);
    }
}