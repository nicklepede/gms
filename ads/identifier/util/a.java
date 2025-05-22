package com.google.android.gms.ads.identifier.util;

import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a {
    public static boolean a(String str) {
        return Objects.equals(str, "com.google.android.adservices.api") || Objects.equals(str, "com.android.adservices.api");
    }

    public static boolean b(String str) {
        return Objects.equals(str, "com.google.android.ext.adservices.api") || Objects.equals(str, "com.android.ext.adservices.api");
    }

    public static boolean c(String str) {
        return Objects.equals(str, "com.google.android.ext.services") || Objects.equals(str, "com.android.ext.services");
    }
}
