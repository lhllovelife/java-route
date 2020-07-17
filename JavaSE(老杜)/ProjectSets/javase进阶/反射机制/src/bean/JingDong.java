package bean;

import javax.swing.*;

/*
提供两个方法
一个登陆方法：参数是用户名，密码
一个退出方法：无参数
 */
public class JingDong {
    public boolean login(String username, String password){
        if("admin".equals(username) && "123".equals(password))
        {
            System.out.println("登陆成功，欢迎" + username +"访问京东购物平台");
            return true;
        }
        else
        {
            System.out.println("您输入的密码有误！");
            return false;
        }
    }

    public void logout(){
        System.out.println("您已安全退出该系统");
    }
}
