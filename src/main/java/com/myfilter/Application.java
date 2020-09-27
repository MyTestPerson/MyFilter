package com.myfilter;

import com.myfilter.config.AppInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = FreeMarkerAutoConfiguration.class)
@Import(AppInit.class)
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
