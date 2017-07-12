package com.imory.bam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class CommonController {

    @RequestMapping(path = {"/login","/"})
    public String login()
    {
        return "login";
    }

    @RequestMapping("doLogin")
    public String doLogin()
    {
        return "index";
    }

    @RequestMapping("/common/index")
    public String index()
    {
        return "index";
    }
}
