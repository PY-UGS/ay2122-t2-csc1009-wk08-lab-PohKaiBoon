public class CheckingAccount {
    
    private double balance;
    private String accNum;

    public CheckingAccount(double balance, String accNum) {
        this.balance = balance;
        this.accNum = accNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccNum() {
        return this.accNum;
    }

    public void withdraw(double withdraw) throws InsufficientFundsException {
        
        if (this.balance<withdraw) {
            throw new InsufficientFundsException(withdraw-this.balance);
        }
        else {
            this.balance-=withdraw;
        }
    }

    public void deposit(double deposit) throws Exception {
        
        if (deposit<=0) {

            throw new Exception("Pls deposit positive notes");
        }
        
        this.balance+=deposit;
   }

}
