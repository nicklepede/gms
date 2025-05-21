package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d extends otm implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.ads.internal.httpcache.f
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel fr = fr();
        oto.e(fr, parcelFileDescriptor);
        fu(1, fr);
    }
}
