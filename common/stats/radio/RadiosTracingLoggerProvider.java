package com.google.android.gms.common.stats.radio;

import defpackage.askv;
import defpackage.askw;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RadiosTracingLoggerProvider {
    public static final NetworkActivityLogger NOOP_ACTIVITY_LOGGER = new askv();
    public static final NetworkLatencyLogger NOOP_LATENCY_LOGGER = new askw();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public interface Logger {
        int deleteEntries(String str, long j, long j2);

        List getEvents(long j, long j2, int i, int i2);

        List getEvents(long j, long j2, int i, int i2, int i3, int i4);

        boolean isNopLogger();
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public interface NetworkActivityLogger extends Logger {
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public interface NetworkLatencyLogger extends Logger {
    }
}
