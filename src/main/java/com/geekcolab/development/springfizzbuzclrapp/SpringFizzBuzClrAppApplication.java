package com.geekcolab.development.springfizzbuzclrapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringFizzBuzClrAppApplication {

    private static Logger LOG = LoggerFactory.getLogger(SpringFizzBuzClrAppApplication.class);

    @Bean
    public CommandLineRunner run(){
        return args -> {
            for(int i = 1; i <= 100; i++){
                String result = "";

                result += (i % 3) == 0 ? "Fizz" : "";
                result += (i % 5) == 0 ? "Buzz" : "";

                System.out.println(result.isEmpty() ? i : result);
//                LOG.info(result.isEmpty() ? i+"" : result);

            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringFizzBuzClrAppApplication.class, args);
    }

}
