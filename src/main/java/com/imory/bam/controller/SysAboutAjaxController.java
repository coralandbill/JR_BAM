package com.imory.bam.controller;

import com.imory.bam.sysuser.bean.SysAbout;
import com.imory.bam.sysuser.service.SysAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/17
 */
@RestController
@RequestMapping("/bam/sysAboutAjax")
public class SysAboutAjaxController {

    @Autowired
    private SysAboutService sysAboutService;

    /**
     * 查询关于我们
     *
     * @return
     */
    @RequestMapping("/loadAbout")
    public SysAbout loadAbout()
    {
        return sysAboutService.loadAbout();
    }

    /**
     * 更新关于我们
     *
     * @param content
     * @return
     */
    @RequestMapping(value = "/updateAbout")
    public Map<String, Object> updateAbout(String content)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysAboutService.update(content);
        resultMap.put("success", true);
        return resultMap;
    }

}
