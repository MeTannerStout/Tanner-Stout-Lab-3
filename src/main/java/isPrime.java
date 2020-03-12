/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author metan
 */
public class isPrime {
    public static void main(String[] args) {
        int intNumber;
        
        do
        {
            System.out.println("Enter a 1 to quit.");
            
            intNumber = getNumber();
            
            if (isPrime(intNumber) == false)
            {
                System.out.println(intNumber + " is not prime.");
            }
            else if (isPrime(intNumber) == true)
            {
                System.out.println(intNumber + " is prime.");
            }
            else
            {
                System.out.println("ERROR DETERMING ISPRIME");
            } 
        } while (intNumber != 1);
    }
    
    public static int getNumber()
    {
        int intNum;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        do
        {
            System.out.println("Please enter an integer value: ");
            intNum = scrKeyboard.nextInt();
        } while (intNum < 1 || intNum > 1000000);
        
        return intNum;
    }
    
    public static boolean isPrime(int intNum)
    {
        boolean booIsPrime = false;
        
        for (int i = 1 ; i <= intNum ; i++)
        {
            if (intNum % i == 0 && i != intNum && i != 1)
            {
                booIsPrime = false;
                break;
            }
            else if (intNum % i == 0 && i == intNum)
            {
                booIsPrime = true;
            }
        }
        
        return booIsPrime;
    }
}
