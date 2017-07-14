package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysClients;
import com.imory.bam.sysuser.dao.SysClientsMapper;
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
 * @Date 2017/7/14
 */
@Service
public class SysClientsService {

    @Autowired
    private SysClientsMapper sysClientsMapper;

    /**
     * 查询所有客户
     * @return
     */
    public List<SysClients> listSysClients()
    {
        return sysClientsMapper.listSysClients();
    }
}
