import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
//        System.out.println("it works");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int a=sc.nextInt();
//        System.out.println("enter the number");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println("the sum is ");
//        System.out.println(sum);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int a=sc.nextInt();
        System.out.println("Enter marks");
        int b=sc.nextInt();
        System.out.println("Enter marks");
        int c=sc.nextInt();
        System.out.println("Enter marks");
        int d=sc.nextInt();
        System.out.println("Enter total");
        int e=sc.nextInt();
        float f=a+b+c+d;
        float g=(f/(e*4))*100;
        System.out.println(g+"%");
    }
}
