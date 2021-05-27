package dev.cloudility.sample.jmh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class JmhTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JmhTest.class);

    public static void main(String[] args) {
        performCalculations();
        LOGGER.info("Processing is over");
    }

    private static void performCalculations() {
        LOGGER.info("Start processing");
        try {
            int randomNum = ThreadLocalRandom.current().nextInt(3000, 4000);
            Thread.sleep(randomNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
