package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g extends otm implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.ads.internal.httpcache.i
    public final void a(HttpRequestParcel httpRequestParcel, f fVar) {
        Parcel fr = fr();
        oto.e(fr, httpRequestParcel);
        oto.g(fr, fVar);
        fu(2, fr);
    }
}
