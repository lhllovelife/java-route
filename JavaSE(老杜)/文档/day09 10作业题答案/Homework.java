// day09
/*
给一个不多于5位的正整数，
要求：
一、求它是几位数
二、逆序打印出各位数字
*/
class FiveNum {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数，不能超过5位数：");
        int num = s.nextInt();
        int count = 0;
        while(num != 0){
            count++;
            System.out.println(num % 10);
            num = num / 10;
        }
        System.out.println(count + "位数");
    }
}


// day10
/*
题目：一个5位数，判断它是不是回文数。即12321是回文数，
个位与万位相同，十位与千位相同
*/
class HuiWenShu {
    public static void main(String[] args) {
        System.out.println("请输入一个五位正整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 10000 && number >= 100000) {
            System.out.println("输入的不是五位正整数!");
            return;
        }
        int a = number / 10000;
        int b = number / 1000 % 10;
        int d = number / 10 % 10;
        int e = number % 10;
        if (a == e && b == d) {
            System.out.println(number + "是回文数");
        } else {
            System.out.println(number + "不是回文数");
        }
    }
}

/*
题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，
还不瘾，又多吃了一个。第二天早上又将剩下的桃子吃掉一半，又多吃了
一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上
想再吃时，只剩下一个桃子了。求第一天共摘了多少
*/
class Monkey {
    public static int peach(int n) {
        int sum = 0;
        if (10 == n) {
            return 1;
        } else {
            sum = peach(n + 1);//求下一天桃子的数量
            sum = (sum + 1) * 2; //第n天桃子的数量
        }
        if (1 == n) {
            System.out.println(sum);
        }
        return sum;//返回第n天桃子的数量
    }
    public static void main(String[] args) {
        peach(1);
    }
}

/*
题目：计算 1! + 2! + 3! + 4! +... + 10!
	说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4
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
题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
求它在第10次落地时，共经过多少米
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
一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个
四位数是多少？
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