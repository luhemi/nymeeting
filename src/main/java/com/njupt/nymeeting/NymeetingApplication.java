package com.njupt.nymeeting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lhm
 */
@SpringBootApplication
@MapperScan("com.njupt.nymeeting.mapper")
//@EnableSwagger2
public class NymeetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(NymeetingApplication.class, args);
    }

}
