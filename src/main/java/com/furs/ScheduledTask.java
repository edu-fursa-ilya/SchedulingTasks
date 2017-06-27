package com.furs;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void printCurrentTime() {
        log.info("Current time: " + sdf.format(new Date()));
    }
}
