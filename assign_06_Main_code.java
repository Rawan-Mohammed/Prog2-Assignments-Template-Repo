//Rawan Mohammed Abdeltawab
//20216116
package banksystem;
public class BankSystem {
    public static void main(String[] args) {
        employee myemp = new employee("Rawan",19,'F',5000,"Btech");
        myemp.Greet();
        myemp.PrintData();
        System.out.println("Salary: " + myemp.getSalary());
        System.out.println("Department: " + myemp.getDepartment());
        
        customer mycus = new customer("Rawan",19,'F',20216116,"Giza");
        mycus.PrintData();
        
        BankAccount myaccount = new BankAccount(5000);
        System.out.println("Balance: " + myaccount.getBalance());
        myaccount.setBalance(2000);
        System.out.println("Balance: " + myaccount.getBalance());
        myaccount.setBalance(5000,10);
        System.out.println("Balance: " + myaccount.getBalance());
    }
    
}
