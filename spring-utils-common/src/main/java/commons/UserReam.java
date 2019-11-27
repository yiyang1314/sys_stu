package commons;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;

public class UserReam extends AuthorizingRealm {

    public String getName(){
        return "usert";
    }

    public boolean support(AuthenticationToken token){
      return  token instanceof UsernamePasswordToken;
    }


    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=(String)token.getPrincipal();
        if(!username.equals("xiaotang")){
            return null;
        }
        SimpleAuthenticationInfo simple=new SimpleAuthenticationInfo(username,"123456",getName());
        return simple;
    }

    /**
     * 授权
     * @param principals
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
       String username=(String)principals.getPrimaryPrincipal();
        ArrayList<String> list=new ArrayList<String>();
        list.add("user:register");
        return null;
    }


    public void cliearCached(){

    }
}
