package DesignPrinciples;

public class Difference implements Calculator
{
    @Override
    public void calculate(int x1, int x2) {
        int diff=x1-x2;

        System.out.println("The difference of two numbers is"+diff);
    }
}