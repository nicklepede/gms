package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class q {
    public static final a a;
    public static final a b;

    static {
        a.c("gads:adapter_initialization:red_button", false);
        a.c("gads:adapter_settings:red_button", false);
        a.c("gads:ads_service_force_stop:red_button", true);
        a.c("gads:banner_refresh_sequential_caching:red_button", false);
        a.c("gads:ad_serving:enabled", true);
        a.c("gads:ad_preloading:enabled", true);
        a.c("gads:adaptive_banner:fail_invalid_ad_size", true);
        a = a.c("gads:sdk_use_dynamic_module", true);
        a.c("gads:signal_adapters:red_button", false);
        b = a.c("gads:use_non_templated_client_sdkcore:enabled", false);
    }
}
