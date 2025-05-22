package com.google.android.gms.ads.social;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class z {
    static final AtomicBoolean a = new AtomicBoolean(false);
    public static final /* synthetic */ int g = 0;
    public final Context b;
    public final GmsDoritosProvider c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.util.aa e;
    final aa f;

    public z(Context context, GmsDoritosProvider gmsDoritosProvider, aa aaVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.aa aaVar2) {
        this.b = context;
        this.c = gmsDoritosProvider;
        this.f = aaVar;
        this.d = versionInfoParcel;
        this.e = aaVar2;
    }
}
