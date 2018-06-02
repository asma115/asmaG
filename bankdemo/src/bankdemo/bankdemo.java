
package bankdemo;
import java.util.Scanner;

class Bank{
    private final int account_no;
            String name,address;
            float balance;
            
     Bank(int ac,String Name,String addr){
         account_no = ac;
         name = Name;
         address = addr;
         balance = 1000;
     }

     	void display(){
         System.out.println("Customer Name::"+name);
         System.out.println("Account Number::"+account_no);
         System.out.println("Customer Address::"+address);
     }
     
     void deposit(){
         float amt;
            System.out.println("Enter the amount to be deposited::");
            Scanner s = new Scanner(System.in);
            amt = s.nextFloat();
            balance += amt;

}

     void withdraw(){
         float amt;
         System.out.println("Enter the amount to be withdrawn::");
            Scanner s = new Scanner(System.in);
            amt = s.nextFloat();
            if((balance-amt)>=1000){
            balance -= amt;
            }
            else
                System.out.println("***Insufficient balance***");
                
         
     }

     void balenq(){
         System.out.println("Your Balance is::" +balance);
         
     }
     
}

public class bankdemo{

    public static void main(String[] args) {
        int choice;
        Bank b = new Bank(1,"asma","std");
        do{
        System.out.println("Enter");
        System.out.println("1:DEPOSIT");
        System.out.println("2:WITHDRAW");
        System.out.println("3:BALANCE ENQUIRY");
        System.out.println("4:Display");
        System.out.println("5.Exit");
        System.out.println("Enter your Choice :: ");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        
        switch(choice)
        {
            case 1:b.deposit();
                   break;
            case 2:b.withdraw();
                   break;
            case 3:b.balenq();
                   break;
            case 4:b.display();
                   break;
            case 5:
                   break;
        }
    }while(choice!=5);
    
}
}
