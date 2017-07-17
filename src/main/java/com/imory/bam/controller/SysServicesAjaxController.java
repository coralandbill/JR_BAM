package com.imory.bam.controller;

import com.imory.bam.sysuser.bean.SysServices;
import com.imory.bam.sysuser.service.SysServicesService;
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
@RequestMapping("sysServicesAjax")
public class SysServicesAjaxController {

    @Autowired
    private SysServicesService sysServicesService;

    /**
     * 列表
     *
     * @return
     */
    @RequestMapping("/listSysServices")
    public List<SysServices> listSysServices()
    {
        return sysServicesService.listSysServices();
    }

    /**
     * 更新
     *
     * @param title
     * @param desc
     * @param id
     * @return
     */
    @RequestMapping("/updateSysServices")
    public Map<String, Object> updateSysServices(String title, String desc, Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysServicesService.update(title, desc, id);
        resultMap.put("success", true);
        return resultMap;
    }

    /**
     * 更新
     *
     * @param id
     * @return
     */
    @RequestMapping("/updateIsEnabled")
    public Map<String, Object> updateIsEnabled(Boolean enabled, Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysServicesService.updateIsEnabled(enabled, id);
        resultMap.put("success", true);
        return resultMap;
    }
}
