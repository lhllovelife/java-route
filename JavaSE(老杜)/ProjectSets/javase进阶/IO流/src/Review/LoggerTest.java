package Review;

public class LoggerTest {
    public static void main(String[] args) {
        Logger.log("建议启动垃圾回收机制");
        Logger.log("你的账号正在进行转账操作");
        Logger.log("您的账号转出金额100元");
        System.out.println("日志工具测试成功");
    }
}
