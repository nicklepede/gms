package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;

    static {
        a.c("gads:init:init_on_bg_thread", true);
        a.c("gads:init:init_on_single_bg_thread", false);
        a = a.c("gads:adloader_load_bg_thread", true);
        a.c("gads:appopen_load_on_bg_thread", true);
        b = a.c("gads:banner_destroy_bg_thread", false);
        c = a.c("gads:banner_load_bg_thread", true);
        d = a.c("gads:banner_pause_bg_thread", false);
        e = a.c("gads:banner_resume_bg_thread", false);
        f = a.c("gads:interstitial_load_on_bg_thread", true);
        a.c("gads:persist_flags_on_bg_thread", true);
        a.c("gads:query_info_bg_thread", true);
        a.c("gads:rewarded_load_bg_thread", true);
    }
}
