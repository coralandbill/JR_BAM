package com.imory.bam.controller;

import com.imory.bam.sysuser.bean.SysNews;
import com.imory.bam.sysuser.service.SysNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
@RequestMapping("/bam/sysNewsAjax")
public class SysNewsAjaxController {

    @Autowired
    private SysNewsService sysNewsService;

    /**
     * 列表
     *
     * @param startPos
     * @param maxRows
     * @return
     */
    @RequestMapping("/listSysNews")
    public List<SysNews> listSysNews(Integer startPos, Integer maxRows)
    {
        return sysNewsService.listSysNews(startPos, maxRows);
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @RequestMapping("/getSysNewsById")
    public SysNews getSysNewsById(Integer id)
    {
        return sysNewsService.getSysNewsById(id);
    }

    /**
     * 新增
     *
     * @param picUrl
     * @param title
     * @param content
     * @param source
     * @param newsDate
     * @return
     */
    @RequestMapping("/saveSysNew")
    public Map<String, Object> saveSysNew(String picUrl, String title, String content, String source,
                                          Date newsDate)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysNewsService.insert(picUrl, title, content, source, newsDate);
        resultMap.put("success", true);
        return resultMap;
    }

    /**
     * 更新
     *
     * @param picUrl
     * @param title
     * @param content
     * @param source
     * @param newsDate
     * @return
     */
    @RequestMapping("/updateSysNew")
    public Map<String, Object> updateSysNew(String picUrl, String title, String content, String source,
                                            Date newsDate, Integer id)
    {
        Map<String, Object> resultMap = new HashMap<>();
        sysNewsService.update(picUrl, title, content, source, newsDate, id);
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
        sysNewsService.deleteById(id);
        resultMap.put("success", true);
        return resultMap;
    }
}
