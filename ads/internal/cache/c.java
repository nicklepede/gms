package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import defpackage.artg;
import defpackage.arth;
import defpackage.tcn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c extends com.google.android.gms.ads.internal.a {
    public c(Context context, Looper looper, artg artgVar, arth arthVar) {
        super(com.google.android.gms.ads.internal.reward.a.a(context), looper, 123, artgVar, arthVar);
    }

    @Override // defpackage.artq
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
    }

    @Override // defpackage.artq
    protected final String c() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // defpackage.artq
    protected final String d() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // defpackage.artq
    public final Feature[] f() {
        return tcn.b;
    }

    public final h g() {
        return (h) super.H();
    }
}
