public class Test02 {
    public static void main(String[] args) {
        X a = new Z();
//        Y b = new Z();
//        Z a1 = (Z)a;
//        a1.xMove();
//        a1.yMove();
        Y b2 = (Y)a;
        b2.yMove();

        Y y = new Z();
        y.xMove();
    }
}

interface X{
    public abstract  void xMove();
}

interface Y extends X{
    public abstract  void yMove();
}

class Z implements Y{
    public void xMove(){
        System.out.println("xmove....");
    }
    public void yMove(){
        System.out.println("ymove....");
    }
}