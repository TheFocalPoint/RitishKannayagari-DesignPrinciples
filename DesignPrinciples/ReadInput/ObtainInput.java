package DesignPrinciples.ReadInput;
import DesignPrinciples.*;

import java.util.*;

public class ObtainInput
{
    static Scanner sc;
    public ObtainInput()
    {
        sc = new Scanner(System.in);
    }

    static int readNumber1()
    {
        return sc.nextInt();
    }
    static int readNumber2()
    {
        return sc.nextInt();
    }

    public void getInput()
    {
        int number1,number2;
        int choice;

        while(true)
        {
            System.out.println("1 -- Sum operation (+)");
            System.out.println("2 -- Difference operation (-)");
            System.out.println("3 -- Product operation (*)");
            System.out.println("4 -- Division operation (/)");
            System.out.println("5 -- Exit ");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            System.out.println();
        switch(choice)
        {

            case 1:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Sum add = new Sum(); 
            add.calculate(number1, number2);
            break;
            case 2:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Difference diff = new Difference();
            diff.calculate(number1, number2);
            break;
            case 3:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Product mul = new Product();
            mul.calculate(number1, number2);
            break;
            case 4:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Division division = new Division();
            division.calculate(number1, number2);
            break;
            case 5:
            System.out.println("Exiting....");
            System.exit(0);
            break;
            default:
            System.out.println("Enter your choice please ");
            break;
                
        }
    }
    }
}