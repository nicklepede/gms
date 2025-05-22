package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class s {
    public static final a a = a.b("gads:dynamite_load:fail:sample_rate", 10000);
    public static final a b = a.c("gads:report_dynamite_crash_in_background_thread", false);
    public static final a c = new a("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final a d = new a("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final a e;
    public static final a f;

    static {
        a.c("gads:sdk_crash_report_enabled", false);
        e = a.c("gads:sdk_crash_report_full_stacktrace", false);
        f = a.a("gads:trapped_exception_sample_rate", 0.01d);
    }
}
