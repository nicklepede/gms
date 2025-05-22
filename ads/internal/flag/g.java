package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g {
    public static final a a = a.c("gads:always_enable_crash_loop_counter_v2:enabled", false);
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;

    static {
        a.c("gads:crash_loop_stats_signal_v2:enabled", false);
        b = a.c("gads:crash_without_flag_write_count_v2:enabled", false);
        c = a.b("gads:crash_without_write_reset_v2:count", -1L);
        a.c("gads:init_without_flag_write_count_v2:enabled", false);
        d = a.b("gads:init_without_write_reset_v2:count", -1L);
        e = a.c("gads:reset_app_settings_v2:enabled", false);
        a.c("gads:reset_counts_on_failure_service_v2:enabled", false);
        a.c("gads:reset_counts_on_local_flag_save_v2:enabled", false);
        a.c("gads:reset_counts_on_successful_service_v2:enabled", false);
    }
}
