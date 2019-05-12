package cn.itsource.jiehang.controller;

import cn.itsource.jiehang.domain.Employee;
import cn.itsource.jiehang.util.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 * @author Tx
 */
@RestController
public class LoginController {

    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public AjaxResult login(@RequestBody Map<String,Object> params){

        String username = (String) params.get("username");
        String password = (String) params.get("password");

        if("Tx".equals(username)&&"shuai".equals(password)){
            //登录成功
            return AjaxResult.me();
        }else{
            //登录失败
            return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误!!!");
        }

    }

}
