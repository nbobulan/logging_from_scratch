import org.testng.annotations.Test;
import org.apache.log4j.Logger;
public class log4JTest {
    static final Logger logger = Logger.getLogger(log4JTest.class);

    @Test
    public void sampleLog4jTest() {
        logger.debug("DEBUG: Designates fine-grained informational events that are most useful to debug an application.");
        logger.info("INFO: Designates informational messages that highlight the progress of the application at coarse-grained level.");
        logger.warn("WARN: Designates potentially harmful situations.");
        logger.error("ERROR: Designates error events that might still allow the application to continue running.");
        logger.fatal("FATAL: Designates very severe error events that will presumably lead the application to abort.");
    }
}
