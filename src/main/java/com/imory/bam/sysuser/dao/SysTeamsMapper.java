package com.imory.bam.sysuser.dao;

import org.apache.ibatis.annotations.*;

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
public interface SysTeamsMapper {

    @Select({
            "select * from sys_teams"
    })
    List<Map<String, Object>> listSysTeams();

    @Insert({
            "insert into sys_teams(name,enName,title,picUrl,createTime)",
            "values",
            "(#{name},#{enName},#{title},#{picUrl},now())"
    })
    int insert();

    @Update({
            "update sys_teams set name=#{name},enName=#{enName},title=#{title},#{picUrl}",
            "where id = #{id}"
    })
    void update(@Param("name") String name, @Param("enName") String enName, @Param("title") Integer title,
                @Param("picUrl") String picUrl, @Param("id") Integer id);

    @Delete({
            "delete from sys_teams where id = #{id}"
    })
    void deleteById(@Param("id") Integer id);
}
