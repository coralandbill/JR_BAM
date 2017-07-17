package com.imory.bam.sysuser.dao;

import com.imory.bam.sysuser.bean.SysServices;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
@Mapper
public interface SysServicesMapper {

    @Select({
            "select * from sys_services"
    })
    List<SysServices> listSysServices();

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
