public class Test01 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
//        使用匿名类。可以不用写一个实现类。可以在new的时候直接在接口名后写。
        mm.mySum(new Compute(){
            public int sum(int a, int b){
                return a + b;
            }
        }, 48, 67);
//        不写匿名类的代码：
        mm.mySum(new ComputeImpl(), 150, 20);
    }
}
