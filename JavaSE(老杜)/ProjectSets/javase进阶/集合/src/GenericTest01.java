public class GenericTest01<T>{
    private String name;
    public static void main(String[] args) {

    }

    public static <T> T doSome(T o){
        return o;
    }

    public void doSome2(T p){
        System.out.println(name);

    }
}
