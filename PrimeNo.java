package JavaCodes;

import java.util.Scanner;

public class PrimeNo
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();

        if(n%2!=0 || n==2 )
        {
            System.out.println("PRIME");
        }
        else
        {
            System.out.println("NOT PRIME");
        }

    }
}
