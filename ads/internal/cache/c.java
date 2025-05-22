package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import defpackage.atvv;
import defpackage.atvw;
import defpackage.uyn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c extends com.google.android.gms.ads.internal.a {
    public c(Context context, Looper looper, atvv atvvVar, atvw atvwVar) {
        super(com.google.android.gms.ads.internal.reward.a.a(context), looper, 123, atvvVar, atvwVar);
    }

    @Override // defpackage.atwf
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
    }

    @Override // defpackage.atwf
    protected final String c() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // defpackage.atwf
    protected final String d() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // defpackage.atwf
    public final Feature[] f() {
        return uyn.b;
    }

    public final h g() {
        return (h) super.H();
    }
}
