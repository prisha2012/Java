public class Main7 {
//    static int logic(int ...arr) {
//        int result=0;
//        for(int a:arr){
//            result+=a;
//        }
//    }
//    static int factorial(int n){
//        if(n==0||n==1){
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
//
//    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print( "*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
      pattern(5);

    }
}
