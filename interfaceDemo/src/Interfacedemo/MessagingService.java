package Interfacedemo;

public class MessagingService 
{
   public static void main(String[] args) 
   {
        Messaging sms = new SMS();
        sms.printConnection();
        sms.print();
        Messaging Email = new email();
        Email.printConnection();
        Email.print();
    }

}