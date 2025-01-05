class base{
    base(){
        System.out.println("base");
    }
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x = x;
    }

}
class derived extends base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }

}

public class Main10 {
    public static void main(String[] args) {
    base b = new base();
    derived d = new derived();

    }
}
