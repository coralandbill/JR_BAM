package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysUser;
import com.imory.bam.sysuser.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/11
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser findUserById(Integer id)
    {
        return sysUserMapper.findUserById(id);
    }
}
