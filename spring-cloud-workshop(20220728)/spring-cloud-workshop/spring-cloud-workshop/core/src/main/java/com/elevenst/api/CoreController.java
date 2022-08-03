package com.elevenst.api;

import java.nio.channels.NonWritableChannelException;
import java.time.LocalDateTime;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class CoreController {
    public LocalDateTime NOW_DATETIME = LocalDateTime.now();

    @Scheduled(fixedDelay = 1000)
    public void task_getWasHeartBeat()
    {
        NOW_DATETIME = LocalDateTime.now();

        if (NOW_DATETIME.getSecond() % 10 == 0)
        {
            System.out.println("Task [getWasHeartBeat] Action : " + ConvertDtToString(NOW_DATETIME) + " || Result : " + getTargetStatus("WAS"));
        }
    }

    @Scheduled(fixedDelay = 1000)
    public void task_getDBHeartBeat()
    {
        NOW_DATETIME = LocalDateTime.now();

        if (NOW_DATETIME.getSecond() % 10 == 5)
        {
            System.out.println("Task [getDB HeartBeat] Action : " + ConvertDtToString(NOW_DATETIME)  + " || Result : " + getTargetStatus("DB"));
        }
    }

    public String ConvertDtToString(LocalDateTime dt)
    {
        return dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getTargetStatus(String target)
    {
        CoreInfoController CoreInfoCtrl = new CoreInfoController();

        return CoreInfoCtrl.getCoreInfo(target).split(":")[1];
    }

}
