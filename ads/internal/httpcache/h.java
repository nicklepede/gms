package com.google.android.gms.ads.internal.httpcache;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.r;
import defpackage.bzps;
import defpackage.eqcy;
import defpackage.eqgc;
import defpackage.qmq;
import defpackage.qmr;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h extends qmq implements i, bzps {
    com.google.android.gms.ads.httpcache.f a;

    public h(Context context) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        com.google.android.gms.ads.httpcache.f fVar;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        com.google.android.gms.ads.httpcache.f fVar2 = com.google.android.gms.ads.httpcache.f.a;
        synchronized (com.google.android.gms.ads.httpcache.f.class) {
            p.c(context);
            if (com.google.android.gms.ads.httpcache.f.a == null) {
                com.google.android.gms.ads.httpcache.f.a = new com.google.android.gms.ads.httpcache.f(context);
            }
            fVar = com.google.android.gms.ads.httpcache.f.a;
        }
        this.a = fVar;
    }

    @Override // com.google.android.gms.ads.internal.httpcache.i
    public final void a(HttpRequestParcel httpRequestParcel, f fVar) {
        com.google.android.gms.ads.httpcache.f fVar2 = this.a;
        if (!r.b(httpRequestParcel.a)) {
            fVar2.b(fVar, null);
        }
        eqgc.t(fVar2.a(httpRequestParcel), new com.google.android.gms.ads.httpcache.e(fVar2, fVar), com.google.android.gms.ads.httpcache.f.b);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        f fVar = null;
        parcelFileDescriptor = null;
        parcelFileDescriptor = null;
        if (i == 1) {
            HttpRequestParcel httpRequestParcel = (HttpRequestParcel) qmr.a(parcel, HttpRequestParcel.CREATOR);
            fD(parcel);
            com.google.android.gms.ads.httpcache.f fVar2 = this.a;
            if (r.b(httpRequestParcel.a)) {
                try {
                    parcelFileDescriptor = (ParcelFileDescriptor) ((eqcy) fVar2.a(httpRequestParcel)).u();
                } catch (InterruptedException unused) {
                    Thread.interrupted();
                } catch (ExecutionException unused2) {
                }
            }
            parcel2.writeNoException();
            qmr.f(parcel2, parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            HttpRequestParcel httpRequestParcel2 = (HttpRequestParcel) qmr.a(parcel, HttpRequestParcel.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
                fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(readStrongBinder);
            }
            fD(parcel);
            a(httpRequestParcel2, fVar);
        }
        return true;
    }

    public h() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }
}
