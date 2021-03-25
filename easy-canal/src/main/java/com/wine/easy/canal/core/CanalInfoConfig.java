package com.wine.easy.canal.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Project easy-canal-parent
 * @PackageName com.wine.easy.canal.core
 * @ClassName CanalInfoConfig
 * @Author qiang.li
 * @Date 2021/3/24 12:33 下午
 * @Description TODO
 */
@Configuration
public class CanalInfoConfig {
    @Value("${easy.canal.host}")
    private String host;
    @Value("${easy.canal.port}")
    private Integer port;
    @Value("${easy.canal.batchSize}")
    private Integer batchSize;
    @Value("${easy.canal.destination:example}")
    private String destination;
    @Value("${easy.canal.username:#{null}}")
    private String username;
    @Value("${easy.canal.password:#{null}}")
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}