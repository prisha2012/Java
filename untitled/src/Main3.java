import java.util.Scanner;
public class Main3 {
    public static void main(String [] args){
        String name =new String ("Harry");
        System.out.println(name);
        Scanner sc = new Scanner (System.in);
        String st=sc.nextLine();
        int value=name.length();
        String Lstring=st.toLowerCase();
        String Ustring=st.toUpperCase();
        String Tstring=st.trim();
        String Sstring=st.substring(3);
        String SSstring=st.substring(0,1);
        st=st.replace(" ","_");
        System.out.println(st);
        System.out.println(value);
        System.out.println(Lstring);
        System.out.println(Ustring);
        System.out.println(Tstring);
        System.out.println(Sstring);
        System.out.println(SSstring);
        System.out.println(st.charAt(0));
        System.out.println(st);
    }
}
