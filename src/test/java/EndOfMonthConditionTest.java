import me.playbosswar.cmttimeconditions.conditions.EndOfMonthCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EndOfMonthConditionTest {

    @Test
        // This test requires manual intervention. Change the date on the machine and check if it works
    void canDetectEndOfMonth() {
        EndOfMonthCondition condition = new EndOfMonthCondition();
        boolean result = condition.evaluate(null);
        assertTrue(result);
    }
}
