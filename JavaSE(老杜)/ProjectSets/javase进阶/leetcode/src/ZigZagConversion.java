public class ZigZagConversion {
    public static void main(String[] args) {
        String s0 = "AB";
        System.out.println(convert(s0, 1));

    }

    public static String convert(String s, int numRows) {
        //当改写行数为1时，直接返回该字符串
        if (numRows == 1) return s;
        char[][] arr = new char[1005][1005];
        int len = s.length();
        int cnt = 0;
        int r = 0, c = 1;
        boolean tag = true; //如果为true, 向下；false 斜向上
        while(cnt < len)
        {
            //向下
            if(tag)
            {
                //行加一，列不变
                r++;
                arr[r][c] = s.charAt(cnt++);
//                System.out.println("向下放的数据：" + arr[r][c]);
                //当走到下边界时，下一次循环向右上方
                if(r == numRows) tag = false;
            }
            else
            {
                //行减一，列加一
                r--;
                c++;
                arr[r][c] = s.charAt(cnt++);
//                System.out.println("斜向上放的数据：" + arr[r][c]);
                //当走到上边界时，下一次循环向下
                if(r == 1) tag = true;
            }
        }
        StringBuffer ans = new StringBuffer();
        for(int i = 1; i <= numRows; i++)
        {
            for(int j = 1; j <= c; j++)
            {
                if (arr[i][j] != '\u0000')
                {
//                    System.out.println("加入："+ arr[i][j]);
                    ans.append(arr[i][j]);
                }
            }
        }
        return ans.toString();
    }
}
/*
AB

PAHNAPLSIIGYIR
PAHNAPLSIIGYIR

PINALSIGYAHRPI
PINALSIGYAHRPI
 */