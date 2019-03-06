package com.example.starttask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Order(value = 2)
public class MyStartupRunner1 implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("任务启动执行");
    }
}
