package DesignPrinciples;

public class Division implements Calculator
{
    public void calculate(int x1,int x2)
    {
        try{
        int div=x1/x2;
        System.out.println("The Division of two numbers is "+div);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}