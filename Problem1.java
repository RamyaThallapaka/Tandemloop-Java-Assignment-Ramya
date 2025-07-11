import java.util.Scanner;
public class Problem1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        double a=sc.nextDouble();
        System.out.print("Enter b value:");
        double b=sc.nextDouble();
        System.out.print("Enter operation:");
        String operation=sc.next();
        Calculator c=new Calculator();
        switch(operation.toLowerCase()) 
        {
            case"add":
                System.out.println("Addition of two values:" +c.add(a, b));
                break;
            case"sub":
                System.out.println("Subtraction of two values: " +c.sub(a, b));
                break;
            case"mul":
                System.out.println("Multiplication of two values: " +c.mul(a, b));
                break;
            case"div":
                if(b != 0) 
                {
                    System.out.println("Division of two values: " +c.div(a, b));
                } else 
                {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}
class Calculator 
{
    public double add(double a,double b) 
    { 
        return a + b; 
    }
    public double sub(double a,double b) 
    { 
        return a - b; 
    }
    public double mul(double a,double b) 
    {
         return a * b; 
    }
    public double div(double a,double b) 
    { 
        return a / b; 
    } 
}
