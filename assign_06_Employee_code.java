//Rawan Mohammed Abdeltawab
//20216116
package banksystem;
public class employee extends human {
    private int Salary;
    private String Department;
    public employee(String name, int age, char gender, int salary, String department) {
        super(name, age, gender);
        Salary = salary;
        Department = department;
    }
    @Override
    public void PrintData(){
        super.PrintData();
        System.out.println(Salary+" "+Department);
    }
    public int getSalary(){
        return Salary;
    }
    public String getDepartment(){
        return Department;
    }
}
