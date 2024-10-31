import me.playbosswar.cmttimeconditions.conditions.StartOfMonthCondition;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StartOfMonthConditionTest {
    @Test
    // This test requires manual intervention. Change the date on the machine and check if it works
    void canDetectStartOfMonth() {
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        StartOfMonthCondition condition = new StartOfMonthCondition();
        boolean result = condition.evaluate(null);
        assertTrue(result);
    }
}
