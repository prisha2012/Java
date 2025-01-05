    class Employee{
        String name;
        public void printDetails(){
            System.out.println("Name: "+name);        }
    }
public class Main8 {
    public static void main(String[] args) {
        Employee harry=new Employee();
        harry.name="Harry";
       harry.printDetails();
    }
}
