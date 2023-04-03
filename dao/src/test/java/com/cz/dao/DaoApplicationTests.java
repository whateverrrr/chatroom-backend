package com.cz.dao;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class DaoApplicationTests {

    @Test
    void contextLoads() {
        FastAutoGenerator.create(
                "jdbc:mysql://192.168.50.10:3306/global_sale?serverTimezone=GMT%2B8&characterEncoding=utf-8&useSSL=false",
                "root", "root").globalConfig(builder -> {
                builder.author("cz") // 设置作者
                    .enableSwagger() // 开启 swagger 模式
                    .fileOverride() // 覆盖已生成文件
                    .outputDir("D://"); // 指定输出目录
            }).packageConfig(builder -> {
                builder.parent("com.cz.dao") // 设置父包名
                    .moduleName("system") // 设置父包模块名
                    .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
            }).strategyConfig(builder -> {
                builder.addInclude("jdw_dolphin_signin"); // 设置需要生成的表名
            }).execute();
    }

}
