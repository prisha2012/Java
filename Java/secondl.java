import java.util.Scanner;
public class secondl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=arr[0];
        int s=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                s=l;
                l=arr[i];
            }
        }
        System.out.println(s);
    }
}
