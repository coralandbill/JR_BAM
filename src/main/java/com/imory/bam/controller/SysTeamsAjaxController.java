package com.imory.bam.controller;

import com.imory.bam.sysuser.bean.SysTeams;
import com.imory.bam.sysuser.service.SysTeamsService;
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
@RequestMapping("/bam/sysTeamsAjax")
public class SysTeamsAjaxController {

    @Autowired
    private SysTeamsService sysTeamsService;

    /**
     * 列表
     *
     * @return
     */
    @RequestMapping("/listSysTeams")
    public List<SysTeams> listSysTeams()
    {
        return sysTeamsService.listSysTeams();
    }

    /**
     * 新增
     *
     * @param name
     * @param enName
     * @param title
     * @param picUrl
     * @return
     */
    @RequestMapping("/saveSysTeam")
    public Map<String, Object> saveSysTeam(String name, String enName, String title, String picUrl)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysTeamsService.insert(name, enName, title, picUrl);
        resultMap.put("success", true);
        return resultMap;
    }

    /**
     * 更新
     *
     * @param name
     * @param enName
     * @param title
     * @param picUrl
     * @return
     */
    @RequestMapping("/updateSysTeam")
    public Map<String, Object> updateSysTeam(String name, String enName, String title,
                                             String picUrl, Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysTeamsService.update(name, enName, title, picUrl, id);
        resultMap.put("success", true);
        return resultMap;
    }

    /**
     * 删除
     *
     * @return
     */
    @RequestMapping("/deleteById")
    public Map<String, Object> deleteById(Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysTeamsService.deleteById(id);
        resultMap.put("success", true);
        return resultMap;
    }
}
