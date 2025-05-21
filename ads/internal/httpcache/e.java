package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e extends otn implements f {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;

    public e() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.ads.internal.httpcache.f
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.a(parcelFileDescriptor);
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) oto.a(parcel, ParcelFileDescriptor.CREATOR);
        fq(parcel);
        a(parcelFileDescriptor);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.google.android.gms.ads.internal.util.future.i iVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.a = iVar;
    }
}
