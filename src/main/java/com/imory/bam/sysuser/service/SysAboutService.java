package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysAbout;
import com.imory.bam.sysuser.dao.SysAboutMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/14
 */
@Service
public class SysAboutService {

    @Autowired
    private SysAboutMapper sysAboutMapper;

    /**
     * 查询关于我们
     *
     * @return
     */
    public SysAbout loadAbout()
    {
        return sysAboutMapper.loadAbout();
    }

    /**
     * 更新关于我们
     *
     * @param content
     */
    public void update(String content)
    {
        sysAboutMapper.update(content);
    }
}
