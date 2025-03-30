package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerConfig {
    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
