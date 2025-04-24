package testclasses;

import javaclasses.Q7;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class Q7Test {
    private final Q7 obj = new Q7();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        obj.longRunningTask(); // This will take 3 seconds and should fail
    }
}
