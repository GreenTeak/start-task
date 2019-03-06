package com.example.starttask;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configurable
@EnableScheduling
public class Scheduling {

    public final static long ONE_Minute = 60 * 1000;

    //任务结束后每秒执行一次
    @Scheduled(fixedDelay = ONE_Minute)
    public void fixedDelayJob() {
        System.out.println ( Thread.currentThread().getName() + "开始执行延时任务"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    //不管任务怎样，每秒执行一次
    @Scheduled(fixedRate = ONE_Minute)
    public void fixedRateJob() {
        System.out.println (Thread.currentThread().getName() + "开始执行定时任务"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "0 0 3 * * ?")
    public void cronJob() {
        System.out.println(" >>cron执行....");
    }

}
