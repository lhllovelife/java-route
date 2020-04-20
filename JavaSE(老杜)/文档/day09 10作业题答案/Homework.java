// day09
/*
��һ��������5λ����������
Ҫ��
һ�������Ǽ�λ��
���������ӡ����λ����
*/
class FiveNum {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("������һ�������������ܳ���5λ����");
        int num = s.nextInt();
        int count = 0;
        while(num != 0){
            count++;
            System.out.println(num % 10);
            num = num / 10;
        }
        System.out.println(count + "λ��");
    }
}


// day10
/*
��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ�������
��λ����λ��ͬ��ʮλ��ǧλ��ͬ
*/
class HuiWenShu {
    public static void main(String[] args) {
        System.out.println("������һ����λ������");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 10000 && number >= 100000) {
            System.out.println("����Ĳ�����λ������!");
            return;
        }
        int a = number / 10000;
        int b = number / 1000 % 10;
        int d = number / 10 % 10;
        int e = number % 10;
        if (a == e && b == d) {
            System.out.println(number + "�ǻ�����");
        } else {
            System.out.println(number + "���ǻ�����");
        }
    }
}

/*
��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
����񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����
һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10������
���ٳ�ʱ��ֻʣ��һ�������ˡ����һ�칲ժ�˶���
*/
class Monkey {
    public static int peach(int n) {
        int sum = 0;
        if (10 == n) {
            return 1;
        } else {
            sum = peach(n + 1);//����һ�����ӵ�����
            sum = (sum + 1) * 2; //��n�����ӵ�����
        }
        if (1 == n) {
            System.out.println(sum);
        }
        return sum;//���ص�n�����ӵ�����
    }
    public static void main(String[] args) {
        peach(1);
    }
}

/*
��Ŀ������ 1! + 2! + 3! + 4! +... + 10!
	˵����4! ��ʾ4�Ľ׳ˡ�4�Ľ׳��ǣ�1 * 2 * 3 * 4
*/
class JieChengSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += jieCheng(i);
        }
        System.out.println(sum);
    }
    public static int jieCheng(int n){
        int result = 1;
        for(int i = n; i > 1; i--){
            result *= i;
        }
        return result;
    }
}

/*
��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�������£�
�����ڵ�10�����ʱ��������������
*/
class Ball {
    public static void main(String[] args) {
        double s = 0;
        double t = 100;
        for (int i = 1; i <= 10; i++) {
            s += t;
            t = t / 2;
        }
        System.out.println(s);
    }
}

/*
һ����λ����ǡ�õ���ȥ��������λ����֮����ʣ����λ����3�������
��λ���Ƕ��٣�
*/
class FourNum {
    public static void main(String[] args) {
        for(int i = 1000; i <= 9999; i++){
            if(i % 1000 * 3 == i){
                System.out.println(i);
            }
        }
    }
}