import java.util.Scanner;

public class BankCode {
    Scanner sc = new Scanner(System.in);

    int accNumber;
    String accHolderName;
    double accBalance = 5000;

    public  BankCode()
    {
        System.out.println("Welcome To SBI Bank");
        System.out.println("Enter Account Number :");
        accNumber = sc.nextInt();

        System.out.println("Enter Your Name :");
        accHolderName = sc.next();
        System.out.println("Welcome "+accHolderName+"\n Your Account No is :"+accNumber+"\n Your account Balance is :"+accBalance);

    }
    public void depositeMoney()
    {
        System.out.println("Enter Money You Want to Deposite :");
        int deposite = sc.nextInt();

        accBalance = accBalance+deposite;
        System.out.println("Your Account balance After Deposite is : "+accBalance);
    }
    public void withdrawMoney()
    {
        System.out.println("Enter Money You Want to Withdraw :");
        int withdraw = sc.nextInt();

        accBalance = accBalance-withdraw;
        System.out.println("Your Account balance After Deposite is : "+accBalance);

    }

    public static void main(String[] args) {
        BankCode bk = new BankCode();
        bk.depositeMoney();
        bk.withdrawMoney();
        
    }
    
}
