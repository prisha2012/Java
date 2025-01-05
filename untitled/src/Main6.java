import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
//    System.out.println("number");
//    int n=sc.nextInt();
//    for(int i=marks.length-1;i>=0;i--) {
//        System.out.println(marks[i]);
//    }
        int max=marks[0];
        for(int i: marks) {
            if(i>max) {
                max=i;
            }
        }
        System.out.println(max);
    }

}
