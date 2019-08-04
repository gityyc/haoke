package com.haoke.dubbo.server;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication
@MapperScan({"com.haoke.dubbo.server.mapper"})
public class DubboProvider {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProvider.class)
            .web(WebApplicationType.NONE) // 非 Web 应用
            .run(args);
    }
}