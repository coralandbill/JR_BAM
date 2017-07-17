package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysServices;
import com.imory.bam.sysuser.dao.SysServicesMapper;
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
public class SysServicesService {

    @Autowired
    private SysServicesMapper sysServicesMapper;

    /**
     * 列表
     *
     * @return
     */
    public List<SysServices> listSysServices()
    {
        return sysServicesMapper.listSysServices();
    }

    /**
     * 更新
     *
     * @param title
     * @param desc
     * @param id
     */
    public void update(String title, String desc, Integer id)
    {
        sysServicesMapper.update(title, desc, id);
    }

    /**
     * 是否启用
     *
     * @param enabled
     * @param id
     */
    public void updateIsEnabled(Boolean enabled, Integer id)
    {
        sysServicesMapper.updateIsEnabled(enabled, id);
    }
}
