package com.google.android.gms.ads.identifier.settings;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class t extends Exception {
    public final int a;
    public final String b;

    public t(int i, String str) {
        super(a(i, str));
        this.a = i;
        this.b = str;
    }

    private static String a(int i, String str) {
        return defpackage.a.q(str, i, "ErrorCode: ", ", ");
    }

    public t(int i, String str, Throwable th) {
        super(a(i, str), th);
        this.a = i;
        this.b = str;
    }
}
