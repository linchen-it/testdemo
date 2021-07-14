package test.linchen.face.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin.chen
 * @date 2021/7/13
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("登陆成功");
        return "you are apple";
    }
}
