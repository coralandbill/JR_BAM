package com.imory.bam.sysuser.dao;

import com.imory.bam.sysuser.bean.SysContacts;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface SysContactsMapper {

    @Select({
            "select * from sys_contacts order by createTime desc limit #{startPos},#{maxRows}"
    })
    List<SysContacts> listSysContacts(@Param("startPos") Integer startPos, @Param("maxRows") Integer maxRows);

    @Insert({
            "insert into sys_contacts(name,mobile,email,title,content,createTime)",
            "values",
            "(#{name},#{mobile},#{email},#{title},#{content},now())"
    })
    int insert(@Param("name") String name, @Param("mobile") String mobile, @Param("email") String email,
               @Param("title") String title, @Param("content") String content);
}
