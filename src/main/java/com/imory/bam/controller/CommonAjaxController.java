package com.imory.bam.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/15
 */
@RestController
public class CommonAjaxController {

    @RequestMapping("doAjaxLogin")
    public String doAjaxLogin(String logonId, String password)
    {
        JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }
}
