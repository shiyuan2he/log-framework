package org.framework.log.commons.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author heshiyuan
 * @date 2021/1/6 23:03
 */
public class CommonsLoggingApplication {
    static Log log = LogFactory.getLog(CommonsLoggingApplication.class);
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        while (true){
            log.info("this is info log " + count);
            log.warn("this is warn log " + count);
            log.debug("this is debug log " + count);
            count ++;
            if(count >= 1000){
                break;
            }
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
