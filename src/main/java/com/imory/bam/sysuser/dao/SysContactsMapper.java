package com.imory.bam.sysuser.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/14
 */
public interface SysContactsMapper {

    @Select({
            "select * from sys_contacts limit #{startPos},#{maxRows}"
    })
    List<Map<String, Object>> listSysContacts(@Param("startPos") Integer startPos, @Param("maxRows") Integer maxRows);

    @Insert({
            "insert into sys_contacts(name,mobile,email,title,content,createTime)",
            "values",
            "(#{name},#{mobile},#{email},#{title},#{content},now())"
    })
    int insert();
}
