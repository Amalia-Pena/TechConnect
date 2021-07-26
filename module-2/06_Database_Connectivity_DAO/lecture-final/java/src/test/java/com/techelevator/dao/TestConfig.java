package com.techelevator.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.io.IOException;
import java.util.Properties;

public class TestConfig {
    private static SingleConnectionDataSource dataSource;

    @Bean
    public static SingleConnectionDataSource setupDataSource() throws IOException {
        Resource resource = new ClassPathResource("/application.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        dataSource = new SingleConnectionDataSource();
        dataSource.setDriverClassName(props.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(props.getProperty("spring.datasource.url"));
        dataSource.setUsername(props.getProperty("spring.datasource.username"));
        dataSource.setPassword(props.getProperty("spring.datasource.password"));
        dataSource.setAutoCommit(false);
        return dataSource;
    }


}
