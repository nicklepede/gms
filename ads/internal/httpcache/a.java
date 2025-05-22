package com.google.android.gms.ads.internal.httpcache;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.atvv;
import defpackage.atvw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a extends com.google.android.gms.ads.internal.a {
    public a(Context context, Looper looper, atvv atvvVar, atvw atvwVar) {
        super(com.google.android.gms.ads.internal.reward.a.a(context), looper, 166, atvvVar, atvwVar);
    }

    @Override // defpackage.atwf
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new g(iBinder);
    }

    @Override // defpackage.atwf
    protected final String c() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // defpackage.atwf
    protected final String d() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final i g() {
        return (i) super.H();
    }
}
