package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysTeams;
import com.imory.bam.sysuser.dao.SysTeamsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SysTeamsService {

    @Autowired
    private SysTeamsMapper sysTeamsMapper;

    /**
     * 列表
     *
     * @return
     */
    public List<SysTeams> listSysTeams()
    {
        return sysTeamsMapper.listSysTeams();
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
    public int insert(String name, String enName, String title, String picUrl)
    {
        return sysTeamsMapper.insert(name, enName, title, picUrl);
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
    public void update(String name, String enName, String title, String picUrl, Integer id)
    {
        sysTeamsMapper.update(name, enName, title, picUrl, id);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Integer id)
    {
        sysTeamsMapper.deleteById(id);
    }
}
