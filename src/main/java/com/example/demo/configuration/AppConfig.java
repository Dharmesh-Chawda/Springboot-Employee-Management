package com.example.demo.configuration;
import com.example.demo.DB;
import com.example.demo.DevDB;
import com.example.demo.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name="project.mode", havingValue = "development")
    public DB getDevBean() {
        return new DevDB();
    }


    @Bean
    @ConditionalOnProperty(name="project.mode", havingValue = "prod")
    public DB getProdBean() {
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
