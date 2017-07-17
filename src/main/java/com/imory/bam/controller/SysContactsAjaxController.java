package com.imory.bam.controller;

import com.imory.bam.sysuser.bean.SysContacts;
import com.imory.bam.sysuser.service.SysContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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
@RequestMapping("sysContactsAjax")
public class SysContactsAjaxController {

    @Autowired
    private SysContactsService sysContactsService;

    /**
     * 列表
     *
     * @param startPos
     * @param maxRows
     * @return
     */
    @RequestMapping("/listSysContacts")
    public List<SysContacts> listSysContacts(Integer startPos, Integer maxRows)
    {
        return sysContactsService.listSysContacts(startPos, maxRows);
    }

    /**
     * 保存
     *
     * @param name
     * @param mobile
     * @param email
     * @param title
     * @param content
     * @return
     */
    @RequestMapping("/saveSysContact")
    public Map<String, Object> saveSysContact(String name, String mobile, String email, String title, String content)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysContactsService.insert(name, mobile, email, title, content);
        resultMap.put("success", true);
        return resultMap;
    }
}
