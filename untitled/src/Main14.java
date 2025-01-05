import java.util.ArrayList;
import java.util.*;
class MyException extends Exception{
    public String toString(){
        return super.toString()+"I am toString()";
    }
    public String getMessage(){
        return super.getMessage()+"I am getMessage()";
    }
}
public class Main14 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);


//        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//        ad1.add(1);
//        ad1.add(2);
//        ad1.addFirst(3);
//        ad1.addLast(4);
//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getLast());

//        LinkedList<Integer> l1=new LinkedList<>();
//        LinkedList<Integer> l2=new LinkedList<>();
//        l2.add(11);
//        l2.add(12);
//        l2.add(13);
//        l2.add(14);
//        l2.add(15);
//
//        l1.add(6);
//        l1.add(7);
//        l1.add(8);
//        l1.add(9);
//        l1.add(10);
//        l1.addAll(l2);
//        for (int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        a = sc.nextInt();
//        if(a<99) {
//            try {
//                throw new MyException();
//            }
//            catch(MyException e) {
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//
//            }
//        }
//    int [] marks=new int[3];
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the marks of each student");
//    marks[0]=sc.nextInt();
//    marks[1]=sc.nextInt();
//    marks[2]=sc.nextInt();
//    int ind=sc.nextInt();
//    int div=sc.nextInt();
//    try{
//        System.out.println(marks[ind]);
//        System.out.println(marks[ind]/div);
//
//    }
//    catch( ArithmeticException e){
//        System.out.println(e);
//    }
//    catch( ArrayIndexOutOfBoundsException e){
//        System.out.println(e);
//    }
//    catch( Exception e){
//        System.out.println(e);
//    }


    }
}
