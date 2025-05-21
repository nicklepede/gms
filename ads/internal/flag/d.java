package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d {
    public static final a a;

    static {
        a.b("gads:app_permissions_caching_expiry_ms:expiry", 60000L);
        a.b("gads:audio_caching_expiry_ms:expiry", 5000L);
        a.b("gads:battery_caching_expiry_ms:expiry", 10000L);
        a = a.b("gads:device_info_caching_expiry_ms:expiry", 300000L);
        a.b("gads:hsdp_caching_expiry_ms:expiry", 600000L);
        a.b("gads:memory_caching_expiry_ms:expiry", 5000L);
        a.b("gads:sdk_environment_caching_expiry_ms:expiry", 600000L);
        a.b("gads:telephony_caching_expiry_ms:expiry", 5000L);
    }
}
