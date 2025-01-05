import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter m1");
        int m1=sc.nextInt();
        System.out.println("enter m2");
        int m2=sc.nextInt();
        System.out.println("enter m3");
        int m3=sc.nextInt();
        System.out.println("enter total");
        int total=sc.nextInt();
        float avg=((m1+m2+m3)*100)/(3.0f*total);
            if (avg>=40&&m1*100/total>=33&&m2*100/total>=33&&m3*100/total>=33) {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

    }
}
