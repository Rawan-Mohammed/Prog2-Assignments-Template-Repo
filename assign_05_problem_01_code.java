//Rawan Mohammed Abdel-Tawab
//20216116
public class BankAccount {
    public double balance;
    public String username;
    public String bankname;
    public final String country="Egypt";
    static int NumOfUsers = 0;
    static int NumOfcalls = 0;
    
    public BankAccount(){
        balance=0;
        username=null;
        bankname=null;
        NumOfUsers++;
        System.out.println("Account Created");
    }
    
    public BankAccount(double ba,String u,String b){
        balance=ba;
        username=u;
        bankname=b;
        NumOfUsers++;
        System.out.println("Account Created");
    }
    
    public void Deposite(double ba){
        balance+=ba;
        NumOfcalls++;
        System.out.println("New Balance after deposite ="+ balance );
    }
    
    public void Withdraw(double ba){
        if(balance>=ba){
            balance-=ba;
            NumOfcalls++;
            System.out.println("New Balance after Withdraw ="+ balance );
        }
        else{
            System.out.println("You can not withdraw");
        }
    }
    
    public static int getNumOfUsers() {
        return NumOfUsers;
    }

    public static int getNumOfCalls() {
        return NumOfcalls;
    }
    public static void main(String[] args) {
        BankAccount bank1 =new BankAccount();
        BankAccount bank2 =new BankAccount(70000,"Rawan","SAIB");
        bank2.Deposite(50000);
        bank2.Withdraw(20000);
        System.out.println("Current balance= " + bank2.balance);
        System.out.println("Number of users in the system= " + BankAccount.getNumOfUsers());
        System.out.println("Number of Deposite() calls= " + BankAccount.getNumOfCalls());
        System.out.println("Number of Withdraw() calls= " + BankAccount.getNumOfCalls());
        
    }
}