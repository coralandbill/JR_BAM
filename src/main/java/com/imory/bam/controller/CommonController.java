package com.imory.bam.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/11
 */
@Controller
@RequestMapping("/bam")
public class CommonController {

    @RequestMapping(path = {"/login"},method = RequestMethod.GET)
    public String login()
    {
        return "/bam/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Map<String, Object> map)
    {
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception = (String) request.getAttribute("shiroLoginFailure");
        String msg = "";
        if (exception != null)
        {
            if (UnknownAccountException.class.getName().equals(exception))
            {
                System.out.println("UnknownAccountException -- > 账号不存在：");
                msg = "账号不存在";
            } else if (IncorrectCredentialsException.class.getName().equals(exception))
            {
                System.out.println("IncorrectCredentialsException -- > 密码不正确：");
                msg = "密码不正确";
            } else if ("kaptchaValidateFailed".equals(exception))
            {
                System.out.println("kaptchaValidateFailed -- > 验证码错误");
                msg = "验证码错误";
            } else
            {
                msg = "else >> " + exception;
                System.out.println("else -- >" + exception);
            }
        }
        map.put("msg", msg);
        // 此方法不处理登录成功,由shiro进行处理.
        return "/bam/index";
    }

    @RequestMapping(path = {"/common/index","/"})
    public String index()
    {
        return "/bam/index";
    }

}
