package com.imory.bam.sysuser.dao;

import com.imory.bam.sysuser.bean.SysNews;
import org.apache.ibatis.annotations.*;

import java.util.Date;
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
public interface SysNewsMapper {

    @Select({
            "select * from sys_news limit #{startPos},#{maxRows}"
    })
    List<SysNews> listSysNews(@Param("startPos") Integer startPos, @Param("maxRows") Integer maxRows);

    @Select({
            "select count(*) from sys_news"
    })
    int countSysNews();

    @Select({
            "select * from sys_news where id = #{id}"
    })
    SysNews getSysNewsById(@Param("id") Integer id);

    @Insert({
            "insert into sys_news(picUrl,title,content,source,newsDate,createTime)",
            "values",
            "(#{picUrl},#{title},#{content},#{source},#{newsDate},now())"
    })
    int insert(@Param("picUrl") String picUrl, @Param("title") String title, @Param("content") String content,
               @Param("source") String source, @Param("newsDate") Date newsDate);

    @Update({
            "update sys_news set picUrl=#{picUrl},title=#{title},content=#{content},source=#{source},#{newsDate}",
            "where id = #{id}"
    })
    void update(@Param("picUrl") String picUrl, @Param("title") String title, @Param("content") String content,
                @Param("source") String source, @Param("newsDate") Date newsDate, @Param("id") Integer id);

    @Delete({
            "delete from sys_news where id = #{id}"
    })
    void deleteById(@Param("id") Integer id);
}
