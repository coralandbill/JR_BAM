package com.imory.bam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/7/11
 */
@SpringBootApplication
@EntityScan(basePackages = "com.imory.bam")
public class App {

    public static void main(String args[])
    {
        SpringApplication.run(App.class,args);
    }
}
