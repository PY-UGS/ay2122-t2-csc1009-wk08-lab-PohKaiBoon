import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        CheckingAccount ca = new CheckingAccount(5000, "120-570-7122");

        System.out.println("Account Number: "+ ca.getAccNum()+ "\tAvailable balance: "+ ca.getBalance() );
        System.out.println("\nSelect Service:\n1---Deposit 2---Withdraw");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                
                System.out.println("Please enter amount to deposit");
                double deposit = sc.nextDouble();
                ca.deposit(deposit);
                System.out.println("$"+deposit+" deposit successfully, your latest balance is $"+ca.getBalance() );
                break;
        
            case 2:
                System.out.println("Please enter amount to withdraw");
                double withdraw = sc.nextDouble();
                try {
                    ca.withdraw(withdraw);
                }
                catch(InsufficientFundsException ife) {

                    System.out.println("Sorry, but your account is short by: $" + ife.getAmount());
                }
                
                
                System.out.println("Available balance : $"+ca.getBalance() );
                break;
        }

    }
}
