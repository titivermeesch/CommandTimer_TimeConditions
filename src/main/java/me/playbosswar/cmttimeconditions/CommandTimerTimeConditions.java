package me.playbosswar.cmttimeconditions;

import me.playbosswar.cmttimeconditions.conditions.EndOfMonthCondition;
import me.playbosswar.cmttimeconditions.conditions.StartOfMonthCondition;
import me.playbosswar.com.api.ConditionExtension;
import me.playbosswar.com.api.ConditionRules;
import me.playbosswar.com.api.events.EventExtension;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CommandTimerTimeConditions extends ConditionExtension {
    ConditionRules rules = new ConditionRules();

    public CommandTimerTimeConditions() {
        rules.register(new StartOfMonthCondition(), new EndOfMonthCondition());
    }

    @Override
    public @NotNull String getConditionGroupName() {
        return "TIME";
    }

    @Override
    public @NotNull
    String[] getDescription() {
        return new String[]{ "§7Use complex time calculations to know when to execute a command" };
    }

    @Override
    public @NotNull String getAuthor() {
        return "PlayBossWar";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.1";
    }

    public @NotNull ConditionRules getRules() {
        return rules;
    }

    @Override
    public ArrayList<EventExtension> getEvents() {
        return null;
    }
}
