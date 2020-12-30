package org.framework.log.logback.java;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author heshiyuan
 * @date 2020/12/29 22:50
 */
public class LogbackJavaApplication {
    static Logger log = LoggerFactory.getLogger("LogbackJavaApplication");

    public static void main(String[] args) throws InterruptedException {
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
