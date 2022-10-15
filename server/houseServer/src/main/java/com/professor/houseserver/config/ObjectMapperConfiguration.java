package com.professor.houseserver.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuchuanlei
 * @since 2022/10/15-21:41
 **/
@Configuration
public class ObjectMapperConfiguration {

  /*  @Bean
    public ObjectMapper objectMapper(){

        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }*/
}
