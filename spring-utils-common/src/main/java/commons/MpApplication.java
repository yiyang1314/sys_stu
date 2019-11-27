package commons;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.util.Factory;

public class MpApplication {


    public static void main(String[] args) {
        Factory<SecurityManager> factory=new
                IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager manager=factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);


        System.out.println("MpApplication.main");
    }
}
