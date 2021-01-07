package org.framework.log.commmons.log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author heshiyuan
 * @date 2021/1/7 15:29
 */
public class CommonsLog4jApplication {
    static Log log = LogFactory.getLog(CommonsLog4jApplication.class);

    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        while (true){
            log.info("this is info log " + count);
            log.warn("this is warn log " + count);
            log.debug("this is debug log " + count);
            log.error("this is error log " + count);
            count ++;
            if(count >= 1000){
                break;
            }
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
