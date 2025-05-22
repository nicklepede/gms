package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e extends qmq implements f {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;

    public e() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.ads.internal.httpcache.f
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.a(parcelFileDescriptor);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qmr.a(parcel, ParcelFileDescriptor.CREATOR);
        fD(parcel);
        a(parcelFileDescriptor);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.google.android.gms.ads.internal.util.future.i iVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.a = iVar;
    }
}
