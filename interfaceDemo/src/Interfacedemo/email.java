package Interfacedemo;
import java.util.Scanner;
public class email implements Messaging 
{
   public String getMessage() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        return scanner.nextLine();
    }
    public String getRecipient() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        return scanner.nextLine();
    }
    public void print() {
        String message = getMessage();
        String recipient = getRecipient();
        System.out.println("Email to " + recipient + ": " + message);
    }
}