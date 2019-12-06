package utils;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logs {

    // Initialize Log4j logs
    final static Logger logger = Logger.getLogger(Logs.class);



    public static void info(String message) {
        logger.info(message);
    }


}
