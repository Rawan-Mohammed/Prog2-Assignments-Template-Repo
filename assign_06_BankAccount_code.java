//Rawan Mohammed Abdeltawab
//20216116
package banksystem;
public final class BankAccount {
    private double Balance;
    
    public BankAccount(double balance) {
        Balance = balance;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double balance){
        if(balance<0 || balance>1000000)
            return;
        Balance+=balance;
    }
    public void setBalance(double balance , double Tax_percent){
        setBalance(balance - (balance * (Tax_percent/100) ) );
    }
}
