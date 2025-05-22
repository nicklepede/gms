package com.google.android.gms.ads.internal.mediation.client;

import android.content.Context;
import com.google.android.gms.ads.internal.flag.s;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b {
    public static void a(bblp bblpVar, Throwable th, String str) {
        com.google.android.gms.ads.internal.report.d.a((Context) ObjectWrapper.a(bblpVar)).f(th, str, ((Double) s.f.d()).floatValue());
    }

    static /* synthetic */ String b(Object obj, Class cls) {
        return cls.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName();
    }
}
