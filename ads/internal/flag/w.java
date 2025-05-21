package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class w {
    public static final a a = a.c("gads:trustless_token_for_decagon:enabled", true);
    public static final a b;

    static {
        a.c("gads:invalidate_token_at_refresh_start", true);
        a.c("gms:expose_token_for_gma:enabled", true);
        a.c("gads:referesh_rate_limit", false);
        b = a.b("gads:timeout_for_trustless_token:millis", 2000L);
        a.c("gads:token_anonymization:enabled", true);
        a.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
