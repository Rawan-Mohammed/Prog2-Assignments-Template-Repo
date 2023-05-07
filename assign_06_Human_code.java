//Rawan Mohammed Abdeltawab
//20216116
package banksystem;
class human {
    protected String Name;
    protected int Age;
    protected char Gender;
    public human(String name, int age, char gender){
        Name=name;
        Age=age;
        Gender=gender;
    }
    public void PrintData(){
        System.out.println(Name+" "+Age+" "+Gender);
    }
    public final void Greet(){
        System.out.println("Good Morning");
    }
}
