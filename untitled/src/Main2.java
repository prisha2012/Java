import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter char");
    char ch=sc.next().charAt(0);
    ch=(char)(ch+8);
    System.out.println(ch);



    }
}
