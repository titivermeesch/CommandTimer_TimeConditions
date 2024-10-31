package me.playbosswar.cmttimeconditions.conditions;

import me.playbosswar.com.api.ConditionRule;
import me.playbosswar.com.api.NeededValue;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Calendar;

public class StartOfMonthCondition implements ConditionRule {
    @Override
    public String getName() {
        return "START_OF_MONTH";
    }

    @Override
    public String getDescription() {
        return "Check if we are the first day of the month";
    }

    @Override
    public boolean evaluate(Facts facts) {
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1;
    }

    @Override
    public ArrayList<NeededValue<?>> getNeededValues() {
        return new ArrayList<>();
    }

    @Override
    public void execute(Facts facts) { }

    @Override
    public int compareTo(@NotNull Rule o) {
        return 0;
    }
}
