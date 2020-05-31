import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(1.0);
        BigDecimal v2 = new BigDecimal(6.0);

        BigDecimal v3 = v1.add(v2);
        BigDecimal v4 = v1.subtract(v2);
        BigDecimal v5 = v1.multiply(v2);
        BigDecimal v6 = v1.divide(v2, 6, BigDecimal.ROUND_HALF_EVEN);

        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);

        DecimalFormat df = new DecimalFormat("###,###.000");
        BigDecimal b1 = new BigDecimal(1150.56);
        String s1 = df.format(3.14);
        System.out.println(s1);
    }
}
