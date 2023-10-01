package me.playbosswar.cmttimeconditions.events;

import me.playbosswar.com.CommandTimerPlugin;
import me.playbosswar.com.api.ConditionExtension;
import me.playbosswar.com.api.NeededValue;
import me.playbosswar.com.api.events.EventExtension;
import me.playbosswar.com.utils.Tools;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TimeChangeEvent extends EventExtension {

    public TimeChangeEvent(Plugin plugin, ConditionExtension extension) {
         final Map<String, String> times = new ConcurrentHashMap<>();

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
            for (World w : Bukkit.getWorlds()) {
                String worldTime = Tools.calculateWorldTime(w);
                if (times.containsKey(w.getName()) && !times.get(w.getName()).equals(worldTime)) {
                    ArrayList<NeededValue<?>> values = new ArrayList<>();
                    values.add(new NeededValue<>("WORLD", "World", World.class, w));
                    values.add(new NeededValue<>("TIME", "Time", String.class, worldTime));
                    CommandTimerPlugin.getInstance().getEventsManager().handleTriggeredEvent(extension, this, values);
                }
                times.put(w.getName(), worldTime);
            }
        }, 0, 1);
    }

    @Override
    public @NotNull String getEventName() {
        return "TIME_CHANGE";
    }

    @Override
    public @NotNull String[] getEventDescription() {
        return new String[]{"Triggered when the world time changes"};
    }

    @Override
    public ArrayList<NeededValue<?>> getReturnedValues() {
        ArrayList<NeededValue<?>> values = new ArrayList<>();
        values.add(new NeededValue<>("WORLD", "World", World.class, null));
        values.add(new NeededValue<>("TIME", "Time", String.class, ""));
        return values;
    }
}
