package com.imory.bam.sysuser.dao;

import com.imory.bam.sysuser.bean.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/11
 */
@Mapper
public interface SysUserMapper {

    @Select({
            "select * from sys_user where id = #{id}"
    })
    SysUser findUserById(@Param("id") Integer id);
}
