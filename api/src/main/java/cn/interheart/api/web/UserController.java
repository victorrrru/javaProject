package cn.interheart.api.web;

import cn.interheart.api.entity.User;
import cn.interheart.api.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.invoke.util.VerifyAccess;

import javax.annotation.Resource;

/**
 * Created by think on 2017/4/6.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping(value="/toAdd")
    public String toAdd() {

        return "add";

    }

    @RequestMapping(value="/saveUser",produces = "application/json")
    @ResponseBody
    public String saveUser(ModelAndView modelAndView, @RequestBody User user) {
        System.out.println(user.getUsername());
        userService.insert(user);
        return "success";

    }

    @RequestMapping(value="/saveUser1")

    public String saveUser1(ModelAndView modelAndView,  User user) {
        userService.insert(user);
        return "success";

    }

    @RequestMapping(value = "/tologin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping(value = "/login")
    public String selectUser(User user) {
        userService.login(user);
        return "success";
    }

}
