package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysNews;
import com.imory.bam.sysuser.dao.SysNewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/17
 */
@Service
public class SysNewsService {

    @Autowired
    private SysNewsMapper sysNewsMapper;

    /**
     * 列表
     *
     * @param startPos
     * @param maxRows
     * @return
     */
    public List<SysNews> listSysNews(Integer startPos, Integer maxRows)
    {
        return sysNewsMapper.listSysNews(startPos, maxRows);
    }

    /**
     * 根据id查新闻
     *
     * @param id
     * @return
     */
    public SysNews getSysNewsById(Integer id)
    {
        return sysNewsMapper.getSysNewsById(id);
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
    public int insert(String picUrl, String title, String content, String source,
                      Date newsDate)
    {
        return sysNewsMapper.insert(picUrl, title, content, source, newsDate);
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
    public void update(String picUrl, String title, String content, String source,
                       Date newsDate, Integer id)
    {
        sysNewsMapper.update(picUrl, title, content, source, newsDate, id);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Integer id)
    {
        sysNewsMapper.deleteById(id);
    }
}
