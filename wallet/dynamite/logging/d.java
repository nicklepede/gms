package com.google.android.gms.wallet.dynamite.logging;

import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class d {
    public static final Charset a = Charset.forName("UTF-8");
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public d(String str, String str2, long j, long j2) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }

    public static long a(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
