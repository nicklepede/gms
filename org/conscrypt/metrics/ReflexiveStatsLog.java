package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ReflexiveStatsLog {
    private static final Class c_statsEvent;
    private static final Class c_statsLog;
    private static final OptionalMethod write;

    static {
        Class initStatsLogClass = initStatsLogClass();
        c_statsLog = initStatsLogClass;
        Class initStatsEventClass = initStatsEventClass();
        c_statsEvent = initStatsEventClass;
        write = new OptionalMethod(initStatsLogClass, "write", initStatsEventClass);
    }

    private ReflexiveStatsLog() {
    }

    private static Class initStatsEventClass() {
        try {
            return Class.forName("android.util.StatsEvent");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Class initStatsLogClass() {
        try {
            return Class.forName("android.util.StatsLog");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void write(ReflexiveStatsEvent reflexiveStatsEvent) {
        Object statsEvent = reflexiveStatsEvent.getStatsEvent();
        if (statsEvent != null) {
            write.invokeStatic(statsEvent);
        }
    }
}
