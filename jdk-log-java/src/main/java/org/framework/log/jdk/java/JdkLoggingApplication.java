package org.framework.log.jdk.java;

import java.util.logging.Logger;

/**
 * @author heshiyuan
 * @date 2021/1/6 22:56
 */
public class JdkLoggingApplication {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}
