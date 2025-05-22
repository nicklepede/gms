package com.google.android.gms.common.stats.radio;

import defpackage.auop;
import defpackage.auoq;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RadiosTracingLoggerProvider {
    public static final NetworkActivityLogger NOOP_ACTIVITY_LOGGER = new auop();
    public static final NetworkLatencyLogger NOOP_LATENCY_LOGGER = new auoq();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public interface Logger {
        int deleteEntries(String str, long j, long j2);

        List getEvents(long j, long j2, int i, int i2);

        List getEvents(long j, long j2, int i, int i2, int i3, int i4);

        boolean isNopLogger();
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public interface NetworkActivityLogger extends Logger {
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public interface NetworkLatencyLogger extends Logger {
    }
}
