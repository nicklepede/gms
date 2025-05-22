package com.google.android.gms.ads.nonagon.load;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class a extends Exception {
    public final int a;

    public a(int i) {
        this.a = i;
    }

    public a(int i, String str) {
        super(str);
        this.a = i;
    }

    public a(String str, Throwable th) {
        super(str, th);
        this.a = 1;
    }
}
