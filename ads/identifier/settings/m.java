package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import defpackage.axre;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class m implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;

    public m(String str, String str2, Context context) {
        this.a = str;
        this.b = str2;
        this.c = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        hashMap.put("pke", this.a);
        hashMap.put("aid", this.b);
        return axre.a(this.c, "ad-event-attest-token", hashMap);
    }
}
