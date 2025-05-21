package com.google.android.gms.ads.internal.config;

import android.os.StrictMode;
import defpackage.eijr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class r {
    public static Object a(eijr eijrVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return eijrVar.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
