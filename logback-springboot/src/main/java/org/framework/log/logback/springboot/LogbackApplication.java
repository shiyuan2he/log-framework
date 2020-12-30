package org.framework.log.logback.springboot;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

/**
 * @author heshiyuan
 * @date 2020/12/22 23:36
 */
@Slf4j
@SpringBootApplication
public class LogbackApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(LogbackApplication.class,args);
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
        int count = 0;
        while (true){
            log.info("this is info log {}", count);
            log.warn("this is warn log {}", count);
            log.debug("this is debug log {}", count);
            count ++;
            if(count >= 1000){
                break;
            }
            TimeUnit.SECONDS.sleep(10);
        }

    }
}
