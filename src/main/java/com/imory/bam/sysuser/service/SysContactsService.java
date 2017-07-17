package com.imory.bam.sysuser.service;

import com.imory.bam.sysuser.bean.SysContacts;
import com.imory.bam.sysuser.dao.SysContactsMapper;
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
public class SysContactsService {

    @Autowired
    private SysContactsMapper sysContactsMapper;

    /**
     * 列表
     *
     * @param startPos
     * @param maxRows
     * @return
     */
    public List<SysContacts> listSysContacts(Integer startPos, Integer maxRows)
    {
        return sysContactsMapper.listSysContacts(startPos, maxRows);
    }

    /**
     * 保存
     *
     * @param name
     * @param mobile
     * @param email
     * @param title
     * @param content
     * @return
     */
    public int insert(String name, String mobile, String email, String title, String content)
    {
        return sysContactsMapper.insert(name, mobile, email, title, content);
    }
}
