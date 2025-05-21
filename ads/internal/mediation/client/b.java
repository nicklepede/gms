package com.google.android.gms.ads.internal.mediation.client;

import android.content.Context;
import com.google.android.gms.ads.internal.flag.s;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azht;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    public static void a(azht azhtVar, Throwable th, String str) {
        com.google.android.gms.ads.internal.report.d.a((Context) ObjectWrapper.a(azhtVar)).f(th, str, ((Double) s.f.d()).floatValue());
    }

    static /* synthetic */ String b(Object obj, Class cls) {
        return cls.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName();
    }
}
