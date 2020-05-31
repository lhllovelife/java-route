public class UserService {
    private String username;
    private String password;
    //setter and getter
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //注册方法
    public void register(String username, String password) throws MyException01{
        //不满足注册条件时手动抛出异常。
        if (username == null || username.length() > 14 || username.length() < 6)
            throw new MyException01("用户名长度范围为：6 - 14");
        this.setUsername(username);
        this.setPassword(password);
        System.out.println("---注册成功---");
        System.out.println("您的账户：" + this.getUsername());
        System.out.println("您的密码：" + this.getPassword());
    }
}
