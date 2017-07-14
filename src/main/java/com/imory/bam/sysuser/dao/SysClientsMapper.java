package com.imory.bam.sysuser.dao;

import com.imory.bam.sysuser.bean.SysClients;
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
public interface SysClientsMapper {

    @Select({
            "select * from sys_clients"
    })
    List<SysClients> listSysClients();

    @Insert({
            "insert into sys_clients(picUrl,bindUrl,createTime)",
            "values",
            "(#{picUrl},#{bindUrl},now())"
    })
    int insert();

    @Delete({
            "delete from sys_clients where id = #{id}"
    })
    void deleteById(@Param("id") Integer id);

    @Update({
            "update sys_clients set picUrl = #{picUrl},bindUrl=#{bindUrl}",
            "where id = #{id}"
    })
    void update(@Param("picUrl") String picUrl, @Param("bindUrl") String bindUrl, @Param("id") Integer id);
}
