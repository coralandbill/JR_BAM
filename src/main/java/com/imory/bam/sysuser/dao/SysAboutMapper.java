package com.imory.bam.sysuser.dao;

import com.imory.bam.sysuser.bean.SysAbout;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
public interface SysAboutMapper {

    @Select({
            "select * from sys_about where id = 1"
    })
    SysAbout loadAbout();

    @Update({
            "update sys_about set content = #{content},createTime=now()",
            "where id = 1"
    })
    void update(@Param("content") String content);
}
