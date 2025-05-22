package com.google.android.gms.ads.internal.config;

import android.os.StrictMode;
import defpackage.ekww;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class r {
    public static Object a(ekww ekwwVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return ekwwVar.lK();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
