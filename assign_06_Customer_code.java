//Rawan Mohammed Abdeltawab
//20216116
package banksystem;
public class customer extends human {
    private int SSN;
    private String Address;
    private BankAccount Account;
    public customer(String name, int age, char gender, int ssn, String address) {
        super(name, age, gender);
        SSN = ssn;
        Address = address;
    }
}
