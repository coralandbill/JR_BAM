package com.imory.bam.controller;

import com.imory.bam.sysuser.bean.SysClients;
import com.imory.bam.sysuser.service.SysClientsService;
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
@RequestMapping("sysClientsAjax")
public class SysClientsAjaxController {

    @Autowired
    private SysClientsService sysClientsService;

    /**
     * 查询所有客户
     *
     * @return
     */
    @RequestMapping("/listSysClients")
    public List<SysClients> listSysClients()
    {
        return sysClientsService.listSysClients();
    }

    /**
     * 新增
     *
     * @param picUrl
     * @param bindUrl
     * @return
     */
    @RequestMapping("/saveSysClient")
    public Map<String, Object> saveSysClient(String picUrl, String bindUrl)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysClientsService.insert(picUrl, bindUrl);
        resultMap.put("success", true);
        return resultMap;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public Map<String, Object> deleteById(Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysClientsService.deleteById(id);
        resultMap.put("success", true);
        return resultMap;
    }

    /**
     * 更新
     *
     * @param id
     * @return
     */
    @RequestMapping("/updateSysClient")
    public Map<String, Object> updateSysClient(String picUrl, String bindUrl, Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysClientsService.update(picUrl, bindUrl, id);
        resultMap.put("success", true);
        return resultMap;
    }
}
