package com.google.android.gms.droidguard.loader;

import android.content.Context;
import defpackage.asng;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class RuntimeApi {
    private final Context a;
    private final String b;

    public RuntimeApi(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Deprecated
    public String a(byte[] bArr) {
        return "";
    }

    public String b() {
        return String.valueOf(asng.e(this.a));
    }

    public String c() {
        return this.b;
    }

    public String f() {
        return String.valueOf(asng.f(this.a));
    }

    @Deprecated
    public void e(int i) {
    }

    @Deprecated
    public void d(Object obj, byte[] bArr) {
    }
}
