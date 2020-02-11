package DesignPrinciples;
public class Sum implements Calculator
{
    public void calculate(int x1,int x2)
    {
        int sum= x1+x2;
        System.out.println("The Sum of two numbers is "+ sum);
    }
}