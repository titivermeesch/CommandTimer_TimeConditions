import me.playbosswar.cmttimeconditions.conditions.StartOfMonthCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartOfMonthConditionTest {
    @Test
    // This test requires manual intervention. Change the date on the machine and check if it works
    void canDetectStartOfMonth() {
        StartOfMonthCondition condition = new StartOfMonthCondition();
        boolean result = condition.evaluate(null);
        assertTrue(result);
    }
}
