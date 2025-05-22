package com.google.android.gms.ads.internal.js.function;

import android.content.Context;
import com.google.android.gms.ads.internal.flag.t;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b {
    public k b;
    private k d;
    public final Object a = new Object();
    private final Object c = new Object();

    public static final Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final k a(Context context, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.nonagon.util.logging.cui.n nVar) {
        k kVar;
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new k(b(context), versionInfoParcel, (String) t.a.d(), nVar);
            }
            kVar = this.d;
        }
        return kVar;
    }
}
