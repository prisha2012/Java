import java.util.Scanner;

public class selectionsort {
    static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }


    }
    public static void main(String[] args){
         Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    selection(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
