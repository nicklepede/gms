package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.arxc;
import defpackage.cclw;
import defpackage.ccpx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccpx();
    public final cclw a;
    public final byte[] b;
    public final SyncOptions c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        cclw b = cclw.b(i);
        this.a = b == null ? cclw.UNKNOWN : b;
        this.b = bArr;
        this.c = syncOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a.f);
        arxc.i(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
