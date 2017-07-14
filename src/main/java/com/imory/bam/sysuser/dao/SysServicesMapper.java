package com.imory.bam.sysuser.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
public interface SysServicesMapper {

    @Select({
            "select * from sys_services"
    })
    List<Map<String, Object>> listSysServices();

    @Update({
            "update sys_services set title=#{title}, desc=#{desc}",
            "where id = #{id}"
    })
    void update(@Param("title") String title, @Param("desc") String desc, @Param("id") Integer id);

    @Update({
            "update sys_services set enabled = #{enabled}",
            "where id = #{id}"
    })
    void updateIsEnabled(@Param("enabled") Boolean enabled, @Param("id") Integer id);
}
