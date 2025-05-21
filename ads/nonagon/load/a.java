package com.google.android.gms.ads.nonagon.load;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
