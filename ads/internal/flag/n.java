package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n {
    public static final a a = a.c("gads:disable_flag_shared_pref_listener_v2:enabled", false);
    public static final a b = a.c("gads:include_package_name_v2:enabled", false);
    public static final a c = a.c("gads:js_flags:mf", false);
    public static final a d = a.b("gads:js_flags:update_interval", 14400000);
    public static final a e = a.c("gads:persist_js_flag:ars", true);
    public static final a f;
    public static final a g;
    public static final a h;

    static {
        a.c("gads:persist_js_flag:as", true);
        f = a.c("gads:persist_js_flag:scar", true);
        g = a.c("gads:read_local_flags_v2:enabled", false);
        h = a.c("gads:read_local_flags_cld_v2:enabled", false);
        a.c("gads:write_local_flags_cld_v2:enabled", false);
        a.c("gads:write_local_flags_client_v2:enabled", false);
        a.c("gads:write_local_flags_service_v2:enabled", false);
    }
}
